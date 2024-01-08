package lajr.petprojects.roaddocumentsapp.driverside.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

    private String plateNumber;
    private String engineNumber;
    private String chassisNumber;
    private String colour;
    private String make;
    private String model;
    private Date year;
    private int seatingCapacity;
    private int ccRating;
    private String fuel;
    private double unladenWeight;
    private double ladenWeight;
    private String bodyType;
    private VehicleRegistration registration;
    private VehicleFitness fitness;
}
