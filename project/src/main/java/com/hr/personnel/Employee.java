package com.hr.personnel;
import java.time.LocalDate;
public class Employee {
    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    // method 1
    public String getEmployeeInfo() {
        return "name = " + name + ", hireDate =" + hireDate;
    }

    // method 2
    public String work() {
        return null;
    }
}
