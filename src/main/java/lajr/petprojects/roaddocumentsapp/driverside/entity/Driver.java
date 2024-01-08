package lajr.petprojects.roaddocumentsapp.driverside.entity;

import lajr.petprojects.roaddocumentsapp.officerside.entity.Ticket;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Driver extends Person {
    private DriversLicense license;
    private Set<Ticket> outstandingTickets;
}
