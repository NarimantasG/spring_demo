package lt.narimantas.springdemo.controler;

import lt.narimantas.springdemo.model.Customer;
import lt.narimantas.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

// localhost:3306 -dta base side
@Controller // localhost:8080 ->127.0.0.1:8080
@RequestMapping(path = "/customer")
public class DemoCustomerController {
    @Autowired
    private CustomerService customerService;

//http://localhost:8080/test
    @GetMapping(path = "/test")
    public @ResponseBody String getTestResult(){
        return"This is some text from SPRING!";
    }

    //http://localhost:8080/customer
    //http://localhost:8080/customer/test/myspecialtest
    @GetMapping(path = "/test/myspecialtest")
    public @ResponseBody String getTestResult1() {
        return"Hello from Narimantas";
    }

    //http://localhost:8080/customer
    //http://localhost:8080/customer/list
    @GetMapping(path="/list")
    public @ResponseBody List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
}
