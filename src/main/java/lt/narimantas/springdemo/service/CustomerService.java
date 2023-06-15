package lt.narimantas.springdemo.service;

import lt.narimantas.springdemo.model.Customer;
import lt.narimantas.springdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> getAllCustomers(){
        return (List<Customer>) customerRepository.findAll();
    }
}
