package lk.easycarrental.controller;


import lk.easycarrental.dto.CarDTO;
import lk.easycarrental.service.CarService;
import lk.easycarrental.util.StanderdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/car")
@CrossOrigin
public class CarController {

    @Autowired
    private CarService service;

    @PostMapping(path = "/savecar")
    public ResponseEntity addCar(@RequestBody CarDTO dto){
        boolean isCarSaved = service.saveCar(dto);
        if(isCarSaved){
            return new ResponseEntity(new StanderdResponse(true,"Car Saved",null), HttpStatus.OK);
        }else{
            return  new ResponseEntity(new StanderdResponse(false,"Car not Saved",null), HttpStatus.OK);
        }
    }

    @GetMapping(path = "/getallcars")
    public ResponseEntity getAllCar(){
        List allCars = service.getAllCars();
        return new ResponseEntity(new StanderdResponse(true,"",allCars),HttpStatus.OK);
    }

    @GetMapping(path = "/searchcars")
    public ResponseEntity searchCars(@RequestParam("brand") String brand,@RequestParam("type") String type,@RequestParam("transmission") String transmission){

        String[] arr={brand,type,transmission};
        System.out.println(arr.toString());

        List list = service.searchCar(arr);
        System.out.println(list.toString());
        return new ResponseEntity(new StanderdResponse(true,"",list),HttpStatus.OK);
    }

    @PutMapping(path = "/updatecar")
    public ResponseEntity updateCar(@RequestBody CarDTO car){
        boolean b = service.updateCar(car);
        if(b){
            return new ResponseEntity(new StanderdResponse(true,"Car Updated",""),HttpStatus.OK);
        }else{
            return new ResponseEntity(new StanderdResponse(false,"Car is Not updated",""),HttpStatus.OK);
        }
    }

    @PutMapping(path = "/deletecar")
    public ResponseEntity deleteCar(@RequestBody CarDTO dto){
        System.out.println(dto);
        boolean deletecar = service.deletecar(dto);

        if(deletecar){
            return new ResponseEntity(new StanderdResponse(true,"car is Deleted",""),HttpStatus.OK);
        }else{
            return new ResponseEntity(new StanderdResponse(false,"car is not Deleted",""),HttpStatus.OK);
        }

    }

    @GetMapping(path = "/getdamagedcars")
    public ResponseEntity getDamagedCars(){
        List damagedCar = service.getDamagedCar("Damaged");
        return new ResponseEntity(new StanderdResponse(true,"",damagedCar),HttpStatus.OK);
    }


    @PostMapping(path = "/addcarmaintanance")
    public ResponseEntity updateCarStatus(@RequestBody String regno){
        System.out.println(regno);
        boolean b = service.updateCarStatus(regno);
        return new ResponseEntity(new StanderdResponse(true,"Car added to Maintanance",""),HttpStatus.OK);
    }

    @GetMapping(path = "/getavailablecars")
    public ResponseEntity getAvailableCars(@RequestParam("pickdate") String pickdate,@RequestParam("dropdate") String dropdate) throws ParseException {
        System.out.println(pickdate);
        System.out.println(dropdate);
        List list = service.availableCars(pickdate, dropdate);


        return new ResponseEntity(new StanderdResponse(true,"Damn",list),HttpStatus.OK);
    }


    @GetMapping(path = "/getcar")
    public ResponseEntity getCar(@RequestParam("regno") String regno){
        List car = service.getCar(regno);
        return new ResponseEntity(new StanderdResponse(true,"",car),HttpStatus.OK);
    }

}
