package com.hr.personnel;

public class Department {

    private final String name;
    private final String location;
    private final Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addEmployee(Employee employee) {
        if (currentIndex < employees.length && employee != null) {
            employees[currentIndex++] = employee;
        } else {
            System.out.println("Cannot add more employees. Array is full or employee is null.");
        }
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int numberOfEmployeesWhoWorked = 0;

        for (int i = 0; i < currentIndex; i++) {
            if (employees[i].work().toLowerCase().startsWith("w")) {
                numberOfEmployeesWhoWorked++;
            }
        }
        return numberOfEmployeesWhoWorked;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public double computeDepartmentMonthlyTotalCompensation() {
        double monthlyTotalCompensation = 0.0;

        for (int i = 0; i < currentIndex; i++) {
            monthlyTotalCompensation
                    += employees[i].computeMonthlyCompensation();
        }

        return monthlyTotalCompensation;
    }

    public void printEmployees() {
        System.out.println("Employees in the department:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("- " + employees[i].getName());

        }
    }

}
