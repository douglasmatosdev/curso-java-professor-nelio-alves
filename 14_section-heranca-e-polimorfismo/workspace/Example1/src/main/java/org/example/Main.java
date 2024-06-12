package org.example;

import org.example.entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount(1001, "Douglas", 1200.00, 2000.00);


        System.out.println("loan limit: " + account.getLoanlimit());
        System.out.println("balance: " + account.getBalance());
        System.out.println("holder: " + account.getHolder());
        System.out.println("number: " + account.getNumber());
    }
}