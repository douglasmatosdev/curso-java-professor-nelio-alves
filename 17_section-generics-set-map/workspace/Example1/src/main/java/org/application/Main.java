package org.application;

import org.services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        PrintService<Integer> ps = new PrintService<Integer>();
        PrintService<String> ps = new PrintService<String>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
//            int value = sc.nextInt();
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
//        Integer x = ps.first();
        String x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}