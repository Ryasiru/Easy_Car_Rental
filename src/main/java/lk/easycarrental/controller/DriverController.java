package lk.easycarrental.controller;


import lk.easycarrental.dto.DriverDTO;
import lk.easycarrental.entity.Driver;
import lk.easycarrental.service.DriverService;
import lk.easycarrental.util.StanderdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/driver")
@CrossOrigin
public class DriverController  {

    @Autowired
    DriverService service;

    @PostMapping(path = "/savedriver")
    public ResponseEntity addDriver(@RequestBody DriverDTO driver){
        boolean b = service.saveDriver(driver);
        if(b){
            return new ResponseEntity(new StanderdResponse(true,"Driver Saved",null), HttpStatus.OK);
        }else{
            return new ResponseEntity(new StanderdResponse(false,"Driver Not Saved",null), HttpStatus.OK);
        }
    }


    @GetMapping(path = "/getalldrivers")
    public ResponseEntity getAllDrivers(){
        List<Driver> allDrivers = service.getAllDrivers();
        return new ResponseEntity(new StanderdResponse(true,"",allDrivers),HttpStatus.OK);

    }

    @PutMapping(path = "/updatedriver")
    public ResponseEntity updateDriver(@RequestBody DriverDTO dto){
        boolean b = service.updateDriver(dto);
        return new ResponseEntity(new StanderdResponse(true,"Driver Updated",""),HttpStatus.OK);
    }


    @GetMapping(path = "/searchdriver")
    public ResponseEntity searchDriver(@RequestParam("nic") String nic){
        List list = service.searchDriver(nic);
        return new ResponseEntity(new StanderdResponse(true,"",list),HttpStatus.OK);
    }

    @PutMapping(path = "/deletedriver")
    public ResponseEntity deleteDriver(@RequestBody DriverDTO driver){
        boolean b = service.deleteDriver(driver);
        return new ResponseEntity(new StanderdResponse(true,"Driver Deleted",""),HttpStatus.OK);
    }
}
