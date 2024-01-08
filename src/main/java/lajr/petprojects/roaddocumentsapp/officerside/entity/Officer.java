package lajr.petprojects.roaddocumentsapp.officerside.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Officer {
    private String badgeId;
    private String firstName;
    private String lastName;
    private String rank;
    private String station;
}
