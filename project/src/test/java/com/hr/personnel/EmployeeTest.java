package com.hr.personnel;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee employee;

    @Before
    public void setUp() throws Exception {
        // create test target object
        employee = new Employee("Mike", LocalDate.of(2020, 03, 04));

    }

    @Test
    public void getEmployeeInfo_should_return_EmployeeInfo() {

        // call test method of the test target object
        String employeeInfo = employee.getEmployeeInfo();

        // assert if the returned value matches the expected value
        Assert.assertEquals("name = Mike, hireDate = 2020-03-04",
                employeeInfo);
        Assertions.assertThat(employeeInfo)
                .isEqualTo("name = Mike, hireDate = 2020-03-04");
    }

    @Test
    public void work_should_return_valid_statement() {
        String work = employee.work();
        Assert.assertEquals("Mike worked", work);
    }
}