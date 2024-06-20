package me.dio.service;

import me.dio.domain.model.Contract;

public interface ContractService {
    Contract findById(Long id);

    Contract create(Contract contractToCreate);
}
