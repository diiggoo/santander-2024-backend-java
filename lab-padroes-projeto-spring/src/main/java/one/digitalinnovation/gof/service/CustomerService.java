package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    Iterable<Customer> findAll();

    Customer findById(Long id);

    void insert(Customer customer);

    void update(Long id, Customer customer);

    void delete(Long id);


}
