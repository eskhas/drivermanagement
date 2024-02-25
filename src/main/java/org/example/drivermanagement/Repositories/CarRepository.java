package org.example.drivermanagement.Repositories;
import org.example.drivermanagement.Models.Car;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
