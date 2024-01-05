package lajr.petprojects.roaddocumentsapp.driverside.entity;

import lombok.Data;

import java.util.Date;

@Data
public class DriversLicense implements Document {

    private String TRN;
    private Driver driver;
    private Date issueDate;
    private Date expiryDate;
    private String countryOfIssue;


}
