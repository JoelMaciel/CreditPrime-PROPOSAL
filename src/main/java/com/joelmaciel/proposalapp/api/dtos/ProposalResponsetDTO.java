package com.joelmaciel.proposalapp.api.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProposalResponsetDTO {

    private Long id;
    private String name;
    private String surname;
    private String phoneNUmber;
    private String cpf;
    private Double income;
    private Double amountRequested;
    private int paymentDeadline;
    private Boolean approved;
    private String observation;

}
