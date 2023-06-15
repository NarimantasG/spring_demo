package lt.narimantas.springdemo.repository;

import lt.narimantas.springdemo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
