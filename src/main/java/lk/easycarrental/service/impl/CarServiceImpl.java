package lk.easycarrental.service.impl;

import lk.easycarrental.dto.CarDTO;
import lk.easycarrental.entity.BookingDetail;
import lk.easycarrental.entity.Car;
import lk.easycarrental.repo.BookingDetailRepo;
import lk.easycarrental.repo.CarRepo;
import lk.easycarrental.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepo repo;

    @Autowired
    BookingDetailRepo bookingrepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public boolean saveCar(CarDTO car) {
        if (!repo.existsById(car.getRegno())) {
            Car c = mapper.map(car, Car.class);
            repo.save(c);
        } else {
            return false;
        }
        return true;
    }

    @Override
    public List getAllCars() {
        List<Car> all = repo.findAll();

        return all;
    }

    @Override
    public List searchCar(String[] arr) {
        String brand = arr[0];
        String type = arr[1];
        String transmission = arr[2];

        List<Car> byBrandAndTypeAndTransmission = repo.findAllByBrandAndTypeAndTransmission(brand, type, transmission);
        System.out.println(byBrandAndTypeAndTransmission);
        return byBrandAndTypeAndTransmission;

    }

    @Override
    public boolean updateCar(CarDTO car) {

        if (repo.existsByRegno(car.getRegno())) {
            Car c = mapper.map(car, Car.class);
            repo.save(c);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deletecar(CarDTO dto) {
        Car c = mapper.map(dto, Car.class);
        repo.delete(c);
        return true;
    }

    @Override
    public List getDamagedCar(String status) {
        List<Car> list = repo.findAllByStatus(status);
        return list;
    }

    @Override
    public boolean updateCarStatus(String regno) {
        String[] split = regno.split("=");
        List<Car> car = repo.findAllByRegno(split[1]);
        car.get(0).setStatus("Maintanance");
        return true;
    }

    @Override
    public List availableCars(String from, String to) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/d");
        LocalDate sdate = LocalDate.parse(from, formatter);
        LocalDate edate = LocalDate.parse(to, formatter);
        System.out.println(sdate + " " + edate);


        List<Car> sendlist = null;
        List<Car> carlist = repo.findAll();
        int size = carlist.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            System.out.println(i);
            int count = 0;
            String regno = carlist.get(i).getRegno();
            List<BookingDetail> booklist = bookingrepo.findAllByRegno(regno);
            int blist = booklist.size();
            System.out.println(blist);
            for (int x = 0; x < blist; x++) {
                System.out.println(x);
                String pickup = booklist.get(x).getPickup();
                String dropoff = booklist.get(x).getDropoff();
                System.out.println(pickup + " " + dropoff);
                LocalDate pdate = LocalDate.parse(pickup, formatter);
                LocalDate ddate = LocalDate.parse(dropoff, formatter);

                System.out.println(pdate + "" + ddate);
                if((sdate.isAfter(pdate)&&sdate.isBefore(ddate))||(edate.isAfter(pdate)&&edate.isBefore(ddate))||(sdate.isBefore(pdate)&& edate.isAfter(ddate))){

                }else{
                    count=count+1;
                }


            }
            if(count==blist){
                sendlist.add(carlist.get(i));
            }


        }

        return sendlist;
    }

    @Override
    public List getCar(String regno) {
        List<Car> list = repo.findAllByRegno(regno);
        return list;
    }


}
