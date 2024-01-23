package com.hr.personnel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class SalariedEmployeeTest {

    private SalariedEmployee employee;

    @BeforeEach
    public void setUp() throws Exception {
        employee = new SalariedEmployee("sang",
                LocalDate.of(2020, 05, 23),
                1000.0);
    }

    @Test
    public void computeMonthlyCompensation_returns_monthly_salary() {

        assertEquals(employee.computeMonthlyCompensation(), 1000.0, 0.01);
    }

    @Test
    public void getEmployeeInfo_should_return_valid_info_on_SalariedEmployee() {

        assertEquals("name = sang, hireDate = 2020-05-23, monthlySalary = 1000.0", employee.getEmployeeInfo());
    }

    @Test
    public void computeMonthlyTaxToPay_should_return_positive_tax_value_when_tax_to_pay_is_greater_than_default_deduction() {
        double monthlyTaxToPay = employee.computeMonthlyTaxToPay();
        assertEquals(50.0, monthlyTaxToPay, 0.01);
    }

    @Test
    public void computeMonthlyTaxToPay_should_return_0_tax_value_when_tax_to_pay_is_less_than_default_deduction() {
        employee = new SalariedEmployee("sang",
                LocalDate.of(2020, 05, 23),
                100.0);
        double monthlyTaxToPay = employee.computeMonthlyTaxToPay();
        assertEquals(0.0, monthlyTaxToPay, 0.01);
    }

    @Test
    public void _throw_TooMuchSalaryException_when_salary_is_set_with_more_than_million() {
        assertThrows(
                TooRichException.class, () -> {
                    employee = new SalariedEmployee("sang",
                            LocalDate.of(2020, 05, 23),
                            2000000.0);
                });

    }

}