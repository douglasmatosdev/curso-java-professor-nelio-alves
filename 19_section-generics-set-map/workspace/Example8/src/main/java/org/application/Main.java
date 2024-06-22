package org.application;

import org.entities.Client;

public class Main {
    public static void main(String[] args) {
        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println();

        Client c1 = new Client("Maria", "maria@email.com");
        Client c2 = new Client("Maria", "maria@email.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); // vai dar false porque ele checa a posição em memória

        System.out.println();

        String s1 = "Test";
        String s2 = "Test";
        System.out.println(s1 == s2);

        s1 = new String("Test");
        s2 = new String("Test");
        System.out.println(s1 == s2);

    }
}