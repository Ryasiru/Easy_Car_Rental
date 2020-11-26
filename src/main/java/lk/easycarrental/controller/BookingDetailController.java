package lk.easycarrental.controller;



import lk.easycarrental.dto.BookingDetailDTO;
import lk.easycarrental.service.BookingDetailService;
import lk.easycarrental.util.StanderdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookingdetail")
@CrossOrigin
public class BookingDetailController {

    @Autowired
    BookingDetailService service;

    @PostMapping(path = "/addbooking")
    public ResponseEntity addBooking(@RequestBody BookingDetailDTO dto){
        boolean b = service.addBooking(dto);
        return new ResponseEntity(new StanderdResponse(true,"Booking Request Has Send",""), HttpStatus.OK);
    }


    @GetMapping(path = "/searchall")
    public ResponseEntity searchAllBookings(@RequestParam("nic") String nic){
        List list = service.searchAllBookings(nic);
        return new ResponseEntity(new StanderdResponse(true,"",list),HttpStatus.OK);
    }

    @GetMapping(path = "/searchmid")
    public ResponseEntity searchByMid(@RequestParam("mid") String mid){
        List list = service.searchByMid(mid);
        return new ResponseEntity(new StanderdResponse(true,"",list),HttpStatus.OK);
    }

    @GetMapping(path = "/getpendingbookings")
    public ResponseEntity getPendingBookings(){
        List list = service.getPendingBookings();
        return new ResponseEntity(new StanderdResponse(true,"",list),HttpStatus.OK);
    }

    @GetMapping(path = "/updatebookingstatus")
    public ResponseEntity updateBookingStatus(@RequestParam("mid") String mid,@RequestParam("status") String status,@RequestParam("id") String id,
                                              @RequestParam("drivername")String name,@RequestParam("drivercontct") String contact){
        boolean b = service.updateBooking(mid, status,id,name,contact);
        return new ResponseEntity(new StanderdResponse(true,"Booking Updated",""),HttpStatus.OK);
    }

    @GetMapping(path = "/getallbookings")
    public ResponseEntity getAllBookings(){
        List allBookings = service.getAllBookings();
        return new ResponseEntity(new StanderdResponse(true,"",allBookings),HttpStatus.OK);
    }

    @GetMapping(path = "/getdriverschedule")
    public ResponseEntity getDriverSchedule(@RequestParam("nic") String nic){
        List list = service.getDriverSchedule(nic);
        return new ResponseEntity(new StanderdResponse(true,"",list),HttpStatus.OK);
    }

}
