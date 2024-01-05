package lajr.petprojects.roaddocumentsapp.driverside.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Car {

    private String plateNumber;
    private String engineNumber;
    private String chassisNumber;
    private String colour;
    private String make;
    private String model;
    private Date year;
}
