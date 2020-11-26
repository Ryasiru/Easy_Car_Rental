package lk.easycarrental.controller;


import lk.easycarrental.dto.CustomerDTO;
import lk.easycarrental.entity.Customer;
import lk.easycarrental.service.CustomerService;
import lk.easycarrental.util.StanderdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService service;

    @PostMapping(path = "/savecustomer")
    public ResponseEntity addCustomer(@RequestBody CustomerDTO dto){
        boolean b = service.saveCustomer(dto);
        if (b){
            return new ResponseEntity(new StanderdResponse(true,"Saved Successfully",null), HttpStatus.OK);
        }else {
            return new ResponseEntity(new StanderdResponse(false,"Not Saved",null), HttpStatus.OK);
        }
    }


    @GetMapping(path = "/getallcustomers")
    public ResponseEntity getAllCustomers(){
        List<Customer> allCustomers = service.getAllCustomers();
        System.out.println(allCustomers);
        return new ResponseEntity(new StanderdResponse(true,"",allCustomers),HttpStatus.OK);
    }

    @GetMapping(path = "/searchcustomer")
    public ResponseEntity searchCustomer(@RequestParam("nic") String nic){
        List list = service.searchCustomer(nic);
        System.out.println(nic);

        return new ResponseEntity(new StanderdResponse(true,"Done",list),HttpStatus.OK);
    }

    @PutMapping(path = "/updatecustomer")
    public ResponseEntity updateCustomer(@RequestBody CustomerDTO customer){

        boolean b = service.updateCustomer(customer);
        return new ResponseEntity(new StanderdResponse(true,"Updated",""),HttpStatus.OK);
    }

    @PutMapping(path = "/deletecustomer")
    public ResponseEntity deleteCustomer(@RequestBody CustomerDTO cust){
        boolean b = service.deleteCustomer(cust);
        return new ResponseEntity(new StanderdResponse(true,"Customer Deleted",""),HttpStatus.OK);
    }

}
