package javaproject.springprj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorldApplication {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}