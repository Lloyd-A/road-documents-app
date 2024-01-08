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
public class Person {
    protected String TRN;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected char sex;
    protected Date dateOfBirth;
    protected Address address;
}
