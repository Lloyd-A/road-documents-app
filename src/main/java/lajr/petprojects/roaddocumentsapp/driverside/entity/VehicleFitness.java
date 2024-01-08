package lajr.petprojects.roaddocumentsapp.driverside.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleFitness extends Document {
    private String trafficAuthority;
    private int odometerReading;
    private String sPermitNumber;
}
