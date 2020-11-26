package lk.easycarrental.repo;


import lk.easycarrental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepo extends JpaRepository<Car,String> {

    List<Car> findAllByBrandAndTypeAndTransmission(String brand,String type,String transmission);

    boolean existsByRegno(String regno);

    List<Car> findAllByStatus(String brand);

    List<Car> findAllByRegno(String regno);



}
