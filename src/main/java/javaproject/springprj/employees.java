package javaproject.springprj;

import jakarta.persistence.*;

@Entity
public class employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String first_name;
    private String last_name;
    private String department;
    private int salary;
    

    // Constructors
    public employees() {}

    public employees(int id , String first_name, String last_name ,String department , int salary) {
        this.id = id;
    	this.first_name = first_name;
        this.last_name = last_name;
        this.department = department;
        this.salary = salary;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFirstName() { return first_name; }
    public void setFirstName(String first_name) { this.first_name = first_name; }

    public String getLastName() { return last_name; }
    public void setLastName(String last_name) { this.last_name = last_name; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }
}