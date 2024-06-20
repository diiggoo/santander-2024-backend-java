package me.dio.controller;

import me.dio.domain.model.Contract;
import me.dio.service.ContractService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/contracts")
public class ContractController {

    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contract> findById(@PathVariable Long id) {
        var contract = contractService.findById(id);
        return ResponseEntity.ok(contract);
    }


    @PostMapping
    public ResponseEntity<Contract> create(@RequestBody Contract contractToCreate) {
        var contractCreated = contractService.create(contractToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(contractCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(contractCreated);

    }
}
