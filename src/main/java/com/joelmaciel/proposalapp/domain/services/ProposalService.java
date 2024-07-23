package com.joelmaciel.proposalapp.domain.services;

import com.joelmaciel.proposalapp.api.dtos.ProposalRequestDTO;
import com.joelmaciel.proposalapp.api.dtos.ProposalResponsetDTO;

public interface ProposalService {
    ProposalResponsetDTO create(ProposalRequestDTO requestDTO);
}
