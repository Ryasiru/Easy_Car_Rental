package lk.easycarrental.service.impl;


import lk.easycarrental.dto.DriverDTO;
import lk.easycarrental.entity.Driver;
import lk.easycarrental.repo.DriverRepo;
import lk.easycarrental.service.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public boolean saveDriver(DriverDTO driver) {

            Driver d = mapper.map(driver, Driver.class);
            repo.save(d);
      return true;
    }

    @Override
    public List<Driver> getAllDrivers() {
        List<Driver> all = repo.findAll();
        return all;
    }

    @Override
    public boolean updateDriver(DriverDTO driver) {
        Driver d = mapper.map(driver, Driver.class);
        repo.save(d);
                return true;
    }

    @Override
    public List searchDriver(String nic) {
        List<Driver> list = repo.findByNic(nic);
        return list;
    }

    @Override
    public boolean deleteDriver(DriverDTO driver) {
        Driver d = mapper.map(driver, Driver.class);
        repo.delete(d);
        return true;
    }
}
