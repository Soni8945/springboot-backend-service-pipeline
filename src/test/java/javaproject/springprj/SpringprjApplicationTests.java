package javaproject.springprj;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.mockito.InjectMocks;
import org.mockito.Mock;


@SpringBootTest
class SpringprjApplicationTests {
		@Mock
	    private UserRepository userRepository;

	    @InjectMocks
	    private EmployeeService employeeService;
	    
	    @Test
		void contextLoads() {
	    }

	    @Test
	    void testGetEmployeeById_found() {
	        employees emp = new employees(1, "John", "Doe", "HR", 50000);
	        when(userRepository.findById(1)).thenReturn(Optional.of(emp));

	        employees result = employeeService.getEmployeeById(1);

	        assertNotNull(result);
	        assertEquals("John", result.getFirstName());
	        assertEquals("Doe", result.getLastName());
	        assertEquals("HR", result.getDepartment());
	        assertEquals(50000, result.getSalary());
	    }
	    
	    @Test
	    void testGetEmployeeById_notFound() {
	        when(userRepository.findById(1)).thenReturn(Optional.empty());

	        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
	            employeeService.getEmployeeById(1);
	        });
	        System.out.println("test message");
	        System.out.println(exception.getMessage());
	        assertEquals("Employee not found", exception.getMessage());
	}	
}

