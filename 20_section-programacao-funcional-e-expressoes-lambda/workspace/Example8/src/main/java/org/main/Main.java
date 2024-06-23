package org.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("EXAMPLE 1 - Implementação da interface :");
        org.example1.Program.main(args);
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println();

        System.out.println("EXAMPLE 2 - Reference method com método estático :");
        org.example2.Program.main(args);
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println();

        System.out.println("EXAMPLE 3 - Reference method com método não estático :");
        org.example3.Program.main(args);
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println();

        System.out.println("EXAMPLE 4 - Expressão lambda declarada :");
        org.example4.Program.main(args);
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println();

        System.out.println("EXAMPLE 5 - Expressão lambda inline :");
        org.example5.Program.main(args);
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println();
    }
}