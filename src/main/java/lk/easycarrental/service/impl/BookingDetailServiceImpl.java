package lk.easycarrental.service.impl;

import lk.easycarrental.dto.BookingDetailDTO;
import lk.easycarrental.entity.BookingDetail;
import lk.easycarrental.repo.BookingDetailRepo;
import lk.easycarrental.service.BookingDetailService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Transactional
public class BookingDetailServiceImpl implements BookingDetailService {

    @Autowired
    BookingDetailRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public boolean addBooking(BookingDetailDTO dto) {
        BookingDetail b = mapper.map(dto, BookingDetail.class);
        repo.save(b);
        return true;
    }

    @Override
    public List searchAllBookings(String nic) {
        List<BookingDetail> list= repo.findAllByNic(nic);
        return list;
    }

    @Override
    public List searchByMid(String mid) {
        int m=Integer.parseInt(mid);
        List<BookingDetail> list = repo.findAllByMid(m);
        return list;
    }

    @Override
    public List getPendingBookings() {
        List<BookingDetail> list = repo.findAllByBookingstatus("Pending");
        return list;
    }

    @Override
    public boolean updateBooking(String mid,String status,String id,String name,String contact) {
        int m=Integer.parseInt(mid);
        List<BookingDetail> allByMid = repo.findAllByMid(m);
        allByMid.get(0).setBookingstatus(status);
        allByMid.get(0).setDriverid(id);
        allByMid.get(0).setDrivername(name);
        allByMid.get(0).setDrivercontact(contact);
        BookingDetail bookingDetail = allByMid.get(0);
        repo.save(bookingDetail);
        return true;

    }

    @Override
    public List getAllBookings() {
        List<BookingDetail> list = repo.findAll();
        return list;
    }

    @Override
    public List getDriverSchedule(String nic) {
        List<BookingDetail> allByDriverid = repo.findAllByDriverid(nic);
        return allByDriverid;
    }

}
