package javaproject.springprj;

import javaproject.springprj.employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<employees, Integer> {
} 