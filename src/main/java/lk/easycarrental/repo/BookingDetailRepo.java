package lk.easycarrental.repo;

import lk.easycarrental.entity.BookingDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingDetailRepo extends JpaRepository<BookingDetail,String> {

    List<BookingDetail> findAllByRegno(String regno);

    List<BookingDetail> findAllByNic(String nic);

    List<BookingDetail> findAllByMid(int mid);

    List<BookingDetail> findAllByBookingstatus(String status);

    List<BookingDetail> findAllByDriverid(String nic);


}
