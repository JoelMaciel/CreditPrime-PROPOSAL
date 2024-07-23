package com.joelmaciel.proposalapp.api.controllers;

import com.joelmaciel.proposalapp.api.dtos.ProposalRequestDTO;
import com.joelmaciel.proposalapp.api.dtos.ProposalResponsetDTO;
import com.joelmaciel.proposalapp.domain.services.ProposalService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api/proposals")
public class ProposalController {

    private final ProposalService proposalService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProposalResponsetDTO create(@RequestBody ProposalRequestDTO requestDTO) {
        return proposalService.create(requestDTO);
    }
}
