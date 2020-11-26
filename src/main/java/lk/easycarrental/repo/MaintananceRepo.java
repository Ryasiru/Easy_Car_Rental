package lk.easycarrental.repo;

import lk.easycarrental.entity.Maintanance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MaintananceRepo extends JpaRepository<Maintanance,String> {

    List<Maintanance> findByMid(String mid);
}
