package services;

import java.security.InvalidParameterException;

public class BrazilianInterestService implements InterestService {
    private double interestRate;

    public BrazilianInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
