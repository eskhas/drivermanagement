package org.example.drivermanagement.Services.Impl;

import org.example.drivermanagement.Models.Driver;
import org.example.drivermanagement.Repositories.DriverRepository;
import org.example.drivermanagement.Services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public List<Driver> fetchDriverList() {
        return (List<Driver>) driverRepository.findAll();
    }

    @Override
    public Driver updateDriver(Driver driver, int driverId) {
        Driver driverDB = driverRepository.findById(driverId)
                .get();

        if(Objects.nonNull(driver.getName())&& !"".equalsIgnoreCase(driver.getName())){
            driverDB.setName(driver.getName());
        }
        if(Objects.nonNull(driver.getAddress())&& !"".equalsIgnoreCase(driver.getAddress())){
            driverDB.setName(driver.getAddress());
        }
        if(Objects.nonNull(driver.getPhone())&& !"".equalsIgnoreCase(driver.getPhone())){
            driverDB.setPhone(driver.getPhone());
        }
        return driverRepository.save(driverDB);

    }

    @Override
    public void deleteDriver(int driverId) {
        driverRepository.deleteById(driverId);
    }
}
