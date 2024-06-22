package org.application;

import org.services.CalculationServiceOnlyIntegers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProgramOnlyIntegers {
    public static void start() {
        List<Integer> list = new ArrayList<>();

        String path = "/tmp/input-integers.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null && !line.isEmpty()) {
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }

            Integer x = CalculationServiceOnlyIntegers.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
