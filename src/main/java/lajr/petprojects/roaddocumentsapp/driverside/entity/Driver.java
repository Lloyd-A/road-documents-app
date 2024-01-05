package lajr.petprojects.roaddocumentsapp.driverside.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Driver {

    private String firstName;
    private String middleName;
    private  String lastName;
    private Date dateOfBirth;
    private DriversLicense license;
}
