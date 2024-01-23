package com.hr.personnel;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTest {

    private Department department;

    @BeforeEach
    public void setUp() throws Exception {
        department = new Department("testing-labs", "Silicon Valley");

        department.addEmployee(new SalariedEmployee("oshay",
                LocalDate.of(1997, 01,13), 5000.0));

        department.addEmployee(new SalariedEmployee("jackson",
                LocalDate.of(1997, 01,13), 3000.0));
    }

    @Test
    public void addEmployee_should_add_an_employee_correctly() {

        int numberOfEmployeesInDepartment = department.getCurrentIndex();

        assertEquals(2, numberOfEmployeesInDepartment);
        department.printEmployees();
    }

    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked_should_return_correct_value() {
        SalariedEmployee s1 = new SalariedEmployee(
                "Oshay",
                LocalDate.of(2024, 1, 1), 25.5

        );
        HourlyEmployee h1 = new HourlyEmployee("Jackson",
                LocalDate.of(2024, 2, 2), 40, 50
                );

        int numberOfEmployeesWhoWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        assertEquals(2, numberOfEmployeesWhoWorked, 2);

    }

    @Test
    public void computeDepartmentMonthlyTotalCompensation_should_return_total_monthly_compensation() {
        department.addEmployee(new HourlyEmployee("Gemini",
                LocalDate.of(2023, 6, 20),
                30.0, 100));
        double monthlyTotalCompensation = department.computeDepartmentMonthlyTotalCompensation();
        assertEquals(11000.0, monthlyTotalCompensation, 0.01);
    }
}