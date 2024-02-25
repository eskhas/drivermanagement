package org.example.drivermanagement.Repositories;

import org.example.drivermanagement.Models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Integer> {
}
