package org.example.drivermanagement.Services;

import org.example.drivermanagement.Models.Driver;

import java.util.List;

public interface DriverService {
    Driver saveDriver(Driver driver);
    List<Driver> fetchDriverList();
    Driver updateDriver(Driver driver,int driverId);
    void deleteDriver(int driverId);
}
