package org.junaeid.talenthub.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer user_id;
    private String username;
    private String email;
    private String password;
    private String name;
    private String address;
    private String role;

}
