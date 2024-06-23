package org.main;

import org.example1.entities.Product;
import org.example1.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Implementação da interface
        System.out.println("EXAMPLE 1 - Implementação da interface: ");
        org.example1.application.Main.main(args);

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        // Reference method com método estático
        System.out.println("EXAMPLE 2 - Reference method com método estático: ");
        org.example2.application.Main.main(args);

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        // Reference method com método não estático
        System.out.println("EXAMPLE 3 - Reference method com método não estático: ");
        org.example3.application.Main.main(args);

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        // Expressão lambda declarada
        System.out.println("EXAMPLE 4 - Expressão lambda declarada: ");
        org.example4.application.Main.main(args);

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();


        // Expressão lambda inline
        System.out.println("EXAMPLE 5 - Expressão lambda inline: ");
        org.example5.application.Main.main(args);
    }
}