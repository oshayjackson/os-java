package com.hr.personnel;
import java.time.LocalDate;

public abstract class Employee {

    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public abstract double computeMonthlyTaxToPay();

    public abstract String getEmployeeInfo();

    public abstract double computeMonthlyCompensation();

    public String work() {
        return name + " worked!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}


