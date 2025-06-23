package com.banking.securebankingapi.model;


import jakarta.persistence.*;
import  lombok.*;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleid;


    @Column(nullable = false, unique = true)
    private String name;
    public String getName() {
        return name;
    }

}
