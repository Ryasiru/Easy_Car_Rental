package lk.easycarrental.repo;

import lk.easycarrental.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DriverRepo extends JpaRepository<Driver,String> {

    List<Driver> findByNic(String nic);

}
