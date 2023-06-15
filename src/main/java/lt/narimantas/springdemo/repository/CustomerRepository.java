package lt.narimantas.springdemo.repository;

import lt.narimantas.springdemo.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Optional<Customer>findByCustomerNumber (int id);
    //SELECT * FROM customers WHERE CustomerNumber = :id
    Iterable<Customer> findByCustomerNameLike(String name);
    //SELECT * FROM customers WHERE CustomerName LIKE ':name'
    @Query(value = """
            SELECT * FROM customers WHERE customerName LIKE: name
            """,nativeQuery = true)
    List<Customer> getCustomerList( @Param("name") String name);
}
