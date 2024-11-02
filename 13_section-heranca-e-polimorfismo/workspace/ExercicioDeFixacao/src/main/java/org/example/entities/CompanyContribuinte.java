package org.example.entities;

public class CompanyContribuinte extends Contribuinte {
    private Integer numberOfEmployees;

    public CompanyContribuinte() {
        super();
    }

    public CompanyContribuinte(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double getTaxPaid() {
        if (numberOfEmployees > 10) {
            return super.getAnnualIncome() * 0.14;
        }
        return super.getAnnualIncome() * 0.16;
    }
}
