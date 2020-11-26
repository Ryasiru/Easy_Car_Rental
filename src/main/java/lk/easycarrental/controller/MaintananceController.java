package lk.easycarrental.controller;


import lk.easycarrental.dto.MaintananceDTO;
import lk.easycarrental.service.MaintananceService;
import lk.easycarrental.util.StanderdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/maintanance")
@CrossOrigin
public class MaintananceController {

    @Autowired
    MaintananceService service;

    @PostMapping(path = "/addmaintanance")
    public ResponseEntity addMaintanance(@RequestBody MaintananceDTO dto){
        boolean b = service.addMaintanance(dto);

        return new ResponseEntity(new StanderdResponse(true,"Maintanance Added",""), HttpStatus.OK);
    }

    @GetMapping(path = "/getallmaintanance")
    public ResponseEntity getAllMaintanance(){
        List allMaintanance = service.getAllMaintanance();
        return new ResponseEntity(new StanderdResponse(true,"",allMaintanance),HttpStatus.OK);
    }

    @GetMapping(path = "/searchmaintanance")
    public ResponseEntity searchMaintanance(@RequestParam("mid") String mid){

        List list = service.searchMaintanance(mid);
        return new ResponseEntity(new StanderdResponse(true,"",list),HttpStatus.OK);
    }
}

