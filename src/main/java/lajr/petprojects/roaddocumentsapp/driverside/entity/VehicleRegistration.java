package lajr.petprojects.roaddocumentsapp.driverside.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleRegistration extends Document {
    private Person owner;
    private int issuingOfficerId;
    private int motorVehicleId;
    private double feePaid;
}
