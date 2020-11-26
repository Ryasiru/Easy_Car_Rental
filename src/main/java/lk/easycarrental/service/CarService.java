package lk.easycarrental.service;


import lk.easycarrental.dto.CarDTO;



import java.util.List;

public interface CarService {

    public boolean saveCar(CarDTO car);

    public List getAllCars();

    public List searchCar(String[] arr);

    public boolean updateCar(CarDTO car);

    public boolean deletecar(CarDTO car);

    public List getDamagedCar(String status);

    public boolean updateCarStatus(String regno);

    public List availableCars(String from,String to);

    public List getCar(String regno);
}
