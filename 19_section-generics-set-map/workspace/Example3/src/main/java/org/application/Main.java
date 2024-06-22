package org.application;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        // myObjs = myNumbers; // erro de compilação porque List<Integer> nãoe é um subtipo de List<Object>

        Object obj;
        Integer x = 10;
        obj = x; // isso funciona porque Integer é um subtipo de Object

        List<?> myObjs2 = new ArrayList<>(); // usando coringa '?' aí funciona
        List<Integer> myNumbers2 = new ArrayList<Integer>();
        myObjs2 = myNumbers2;
    }
}