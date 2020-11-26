package lk.easycarrental.service;

import lk.easycarrental.dto.BookingDetailDTO;

import java.util.List;

public interface BookingDetailService {

    public boolean addBooking(BookingDetailDTO dto);

    public List searchAllBookings(String nic);

    public List searchByMid(String mid);

    public List getPendingBookings();

    public boolean updateBooking(String mid,String status,String id,String name,String contact);

    public List getAllBookings();

    public List getDriverSchedule(String nic);
}
