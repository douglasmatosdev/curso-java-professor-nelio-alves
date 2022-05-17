package secao_14.bank.application;

import secao_14.bank.entities.Account;
import secao_14.bank.entities.BusinessAccount;
import secao_14.bank.entities.SavingsAccount;

public class Program {

    public static void run() {

        Account acc6 = new Account(1006, "Alexander", 1000.0);
        acc6.withDraw(200.0);
        System.out.println("acc6: "+ acc6.getBalance());

        Account acc8 = new BusinessAccount(1008, "Alexander", 1000.0, 500.0);
        acc8.withDraw(200.0);
        System.out.println("acc8: "+acc8.getBalance());

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING and OVERRIDE
        Account acc7 = new SavingsAccount(1007, "Alexander", 1000.0, 0.01);
        acc7.withDraw(200.0);
        System.out.println("acc7: "+ acc7.getBalance());

        Account acc1 = acc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // Should error
        // BusinessAccount acc5 = (BusinessAccount) acc3;
        // Correct
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);;
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
