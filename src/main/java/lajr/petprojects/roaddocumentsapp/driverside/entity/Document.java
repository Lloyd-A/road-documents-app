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
public abstract class Document {
    protected Date issueDate;
    protected Date expiryDate;
    protected Car car;
    private String typeOfVehicle;
}
