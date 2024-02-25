package org.example.drivermanagement.Services;

import org.example.drivermanagement.Models.Car;
import org.example.drivermanagement.Models.Driver;

import java.util.List;

public interface CarService {
    Car saveCar(Car car);
    List<Car> fetchCarList();
    Car updateDriver(Car car,int carId);
    void deleteDriver(int carId);
}
