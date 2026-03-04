package org.junaeid.talenthub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Recruiter {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer recruiter_id;
    private Integer user_id;
    private Integer company_id;
}
