package lt.narimantas.springdemo.boot_strap;

import lt.narimantas.springdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        customerRepository.findAll().forEach(System.out::println);
        System.out.println("\n------------------------------\n");
        System.out.println(
                customerRepository.findById(161)
        );
    }
}
