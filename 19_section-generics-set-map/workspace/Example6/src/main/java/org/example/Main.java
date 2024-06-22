package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Princípio get/put - covariância
         *
         * get - OK
         * put - ERROR
         */
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);
        List<? extends Number> list = intList;
        Number x1 = list.get(0);
//        list.add(20); // erro de compilacao



        /**
         * Princípio get/put - contravariância
         *
         * get - ERROR
         * put - OK
         */
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");
        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);
//        Number x2 = myNums.get(0); // erro de compilacao
    }
}