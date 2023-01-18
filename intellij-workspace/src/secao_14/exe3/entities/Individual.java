package secao_14.exe3.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        Double basicTax = 0.0;

        if (getAnualIncome() < 20000.00) {
            basicTax = (getAnualIncome() * 0.15);
        } else if (this.getAnualIncome() >= 20000.00) {
            basicTax = (getAnualIncome() * 0.25);
        }
        basicTax -= (healthExpenditures * 0.50);
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }
        return basicTax -= (healthExpenditures * 0.50);
    }
}
