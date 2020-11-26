package lk.easycarrental.service;


import lk.easycarrental.dto.DriverDTO;

import java.util.List;

public interface DriverService {

    public boolean saveDriver(DriverDTO driver);

    public List getAllDrivers();

    public boolean updateDriver(DriverDTO driver);

    public List searchDriver(String nic);

    public boolean deleteDriver(DriverDTO driver);
}
