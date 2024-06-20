package me.dio.service.impl;

import me.dio.domain.model.Contract;
import me.dio.repository.ContractRepository;
import me.dio.service.ContractService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ContractServiceImpl implements ContractService {

    private final ContractRepository contractRepository;

    public ContractServiceImpl(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public Contract findById(Long id) {
        return contractRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }


    @Override
    public Contract create(Contract contractToCreate) {
        if (contractRepository.existsByContractNumber(contractToCreate.getContractNumber())){
            throw new IllegalArgumentException("This contract already exists.");
        }
        return contractRepository.save(contractToCreate);
    }
}
