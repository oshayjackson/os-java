package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

import static gov.irs.TaxPayer.SALARIED_TAX_RATE;
import static gov.irs.TaxPayer.computeStandardEmployeeMonthlyDeduction;

public class SalariedEmployee extends Employee implements TaxPayer {

    private double monthlySalary;

    public SalariedEmployee(
            String name,
            LocalDate hireDate,
            double monthlySalary
    ) {
        super(name, hireDate);
        if (monthlySalary > 1000000){
            throw new TooRichException("salry is too much");
        }
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String getEmployeeInfo() {
        return "name = " +  getName() + ", "
                + "hireDate = " + getHireDate() + ", "
                + "monthlySalary = " + getMonthlySalary();
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        double monthlyTaxToPay = computeMonthlyCompensation() * SALARIED_TAX_RATE
                - computeStandardEmployeeMonthlyDeduction();
        if (monthlyTaxToPay < 0.0) {
            return 0.0;
        }
        return monthlyTaxToPay;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary > 1000000){
            throw new TooRichException("You make too much money");
        }
        this.monthlySalary = monthlySalary;
    }
}
