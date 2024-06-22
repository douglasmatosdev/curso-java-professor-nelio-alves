package org.application;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrs);
    }

    public static void printList(List<?> list) { // usando coringa '?' podemos imprimir qualquer tipo de lista
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}