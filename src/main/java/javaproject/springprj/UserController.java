package javaproject.springprj;

import javaproject.springprj.employees;
import javaproject.springprj.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // GET /users
    @GetMapping
    public List<employees> getAllUsers() {
        return userRepository.findAll();
    }

    // POST /users
    @PostMapping
    public employees createUser(@RequestBody employees employees) {
        return userRepository.save(employees);
    }
}
