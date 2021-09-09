package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.Customer;
import hello.CustomerRepository;


@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
               
    @Autowired
    CustomerRepository customerRepository;
    
    @RequestMapping("/greeting")
    public List<Customer> greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	
    	return customerRepository.findAll();
    	
    	/*
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
        */
            	    	
                   
    }
}
