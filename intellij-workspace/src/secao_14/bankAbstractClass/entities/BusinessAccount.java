package secao_14.bankAbstractClass.entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {

    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += loanLimit - 10.0;
        }
    }

    @Override
    public void withDraw(Double amount) {
       super.withDraw(amount);
       balance -= 2.0;
    }
}
