package lajr.petprojects.roaddocumentsapp.officerside.entity;

import lajr.petprojects.roaddocumentsapp.driverside.entity.Car;
import lajr.petprojects.roaddocumentsapp.driverside.entity.Driver;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ticket {
    private int ticketNumber;
    private LocalDateTime issueDateTime;
    private Driver driver;
    private Car car;
    private Location offenceLocation;
    private Offence offence;
    private Date courtDate;
    private String courtName;
    private Officer officer;
    //allow payments on ticket
    //small payments can be made to accumulate to fine
    private double amountPaid;

}
