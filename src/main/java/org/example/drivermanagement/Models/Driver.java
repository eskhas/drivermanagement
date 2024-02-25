package org.example.drivermanagement.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int driverId;
    private String name;
    private String address;
    private String phone;

    public Driver() {
    }

    public Driver(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Driver(id=" + this.getDriverId() + ", name=" + this.getName() + ", address=" + this.getAddress() + ", phone=" + this.getPhone() + ")";
    }
}

