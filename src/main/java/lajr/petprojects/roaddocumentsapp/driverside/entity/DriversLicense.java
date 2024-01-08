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
public class DriversLicense extends Document {
    private Driver driver;
    private String countryOfIssue;
    private String LicenseClass;
    private String collectorate;


}
