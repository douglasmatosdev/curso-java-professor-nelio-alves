package secao_14.bankAbstractClass.application;

import secao_14.bankAbstractClass.entities.Account;
import secao_14.bankAbstractClass.entities.BusinessAccount;
import secao_14.bankAbstractClass.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramAbstractClass {

    public static void run() {

        Locale.setDefault(Locale.US);
        // A classe Account é abstract e por isso não pode ser instânciada
        // Account acc1 = new Account(1001, "Alex", 1000.0);
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.00);

        /**
         *  Mesmo a classe Account sendo abstract ela é uma classe genérica
         *  que nos ajuda no reuso de código e no polimorfismo
         */

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0));
        list.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
        list.add(new SavingsAccount(1004, "Anna", 500.00, 500.00));

        double sum = 0;

        for (Account account : list) {
            sum += account.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account account : list) {
            account.deposit(10.0);
        }

        for (Account account : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", account.getNumber(), account.getBalance());
        }
    }

}
