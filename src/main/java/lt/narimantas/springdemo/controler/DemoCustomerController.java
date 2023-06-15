package lt.narimantas.springdemo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// localhost:3306 -dta base side
@Controller // localhost:8080 ->127.0.0.1:8080
@RequestMapping(path = "/customer")
public class DemoCustomerController {

    //Customer http://localhost:8080/Customer/test
    //Customer http://localhost:8080/Customer/list
    //Customer http://localhost:8080/Customer/120
    //Payments http://localhost:8080/Payments
    //Emplyees http://localhost:8080/Emplyees
    //Products http://localhost:8080/Products

//http://localhost:8080/test
    @GetMapping(path = "/test")
    public @ResponseBody String getTestResult(){
        return"This is some text from SPRING!";
    }
    @GetMapping(path = "/test/myspecialtest")
    public @ResponseBody String getTestResult1() {
        return"Hello from Narimantas";
    }

}
