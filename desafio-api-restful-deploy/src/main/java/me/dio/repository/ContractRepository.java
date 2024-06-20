package me.dio.repository;

import me.dio.domain.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

    boolean existsByContractNumber(String contractNumber);

}
