package org.junaeid.talenthub.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class JobSeeker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jobseeker_id;
    private Integer user_id;
    private String photo;
    private String document;
}
