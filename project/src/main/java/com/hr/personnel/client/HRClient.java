package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {

    public static void main(String[] args) {

        Employee s1 = new SalariedEmployee(
                "-Oshay Jackson-",
                LocalDate.of(2010, 12, 12),
                2000.0);
        String s1_info = s1.getEmployeeInfo();
        System.out.println(s1_info);

        Employee s2 = new SalariedEmployee(
                "-Gemini Jackson-",
                LocalDate.of(2020, 02, 12),
                3000.0);
        String s2_info = s2.getEmployeeInfo();
        System.out.println(s2_info);

        Employee h1 = new HourlyEmployee(
                "-Zac Efron-",
                LocalDate.of(2021, 03, 23),
                10.0, 100);
        String h1_info = h1.getEmployeeInfo();
        System.out.println(h1_info);

        Department department = new Department("engineering", "Seattle");
        department.addEmployee(s1);
        department.addEmployee(s2);
        department.addEmployee(h1);
        int numberOfEmployeesWhoWorked
                = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.println("number of employees who worked = " +
                numberOfEmployeesWhoWorked);

        double monthlyTotalCompensation = department.computeDepartmentMonthlyTotalCompensation();
        System.out.println("monthly total compensation = " + monthlyTotalCompensation);
    }
}
