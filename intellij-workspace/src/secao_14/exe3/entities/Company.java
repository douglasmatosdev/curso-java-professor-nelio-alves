package secao_14.exe3.entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company() {

    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (getNumberOfEmployees() > 10) {
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }
}
