package lajr.petprojects.roaddocumentsapp.officerside.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Offence {
    private String offenceTitle;
    private String speedDeviceId;
    private String speedLimit;
    private String speedRecorded;
    private int pointsAssigned;
    private double fine;
    private Date fineDueDate;
    private String comment;
}
