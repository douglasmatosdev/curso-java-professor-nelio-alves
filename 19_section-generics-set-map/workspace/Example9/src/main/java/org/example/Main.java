package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        Set<String> set = new TreeSet<>();
        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));
        printSet(set);

        System.out.println();
        set.remove("Tablet");
        printSet(set);

        System.out.println();
        set.removeIf(x -> x.charAt(0) == 'N');
        printSet(set);

        System.out.println();
        set.removeIf(x -> x.length() >= 3);
        printSet(set);
    }

    public static void printSet(Set<String> set) {
        for (String p : set) {
            System.out.println(p);
        }
    }
}