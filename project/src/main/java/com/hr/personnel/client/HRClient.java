package com.hr.personnel.client;

import com.hr.personnel.Employee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Employee employee = new Employee("Oshay", LocalDate.of(1997, 01, 13));
        String employeeInfo = employee.getEmployeeInfo();
        System.out.println(employeeInfo);
    }
}
