package de.itsecviefhaus.demos.testingspringinteragtion;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String sayHello(){
        return "Hello, I'm the Demo Service!";
    }
}
