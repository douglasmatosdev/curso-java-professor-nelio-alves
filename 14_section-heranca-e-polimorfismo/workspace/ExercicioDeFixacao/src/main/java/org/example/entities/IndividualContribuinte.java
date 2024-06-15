package org.example.entities;

public class IndividualContribuinte extends Contribuinte {

    private Double healthExpenditures;

    public IndividualContribuinte() {
        super();
    }

    public IndividualContribuinte(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double getTaxPaid() {
        return (super.getAnnualIncome() * 0.25) - (healthExpenditures * 0.50);
    }

}
