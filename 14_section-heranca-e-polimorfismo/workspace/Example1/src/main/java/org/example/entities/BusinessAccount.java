package org.example.entities;

public class BusinessAccount extends Account {
    private Double loanlimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanlimit) {
        super(number, holder, balance);
        this.loanlimit = loanlimit;
    }

    public Double getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(Double loanlimit) {
        this.loanlimit = loanlimit;
    }

    public void loan(double amount) {
        if (amount <= loanlimit) {
            deposit(amount);
            balance += amount - 10;
        }
    }
}
