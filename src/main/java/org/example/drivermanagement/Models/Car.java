package org.example.drivermanagement.Models;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int carId;
    private String brand;
    private String model;
    private String color;
    private String type;

    public Car() {
    }
    public Car(String brand, String model, String color, String type) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
    }


}
