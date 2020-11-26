package lk.easycarrental.repo;


import lk.easycarrental.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,String> {

    List<Customer> findByNic(String nic);
}
