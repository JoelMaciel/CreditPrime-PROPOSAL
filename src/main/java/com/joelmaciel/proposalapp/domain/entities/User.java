package com.joelmaciel.proposalapp.domain.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class User {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String cpf;
    private String phoneNumber;
    private Double income;

    @OneToOne(mappedBy = "user")
    private Proposal proposal;
}
