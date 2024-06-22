package org.application;

import org.entities.Product;
import org.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Teste com apenas números inteiros
        // ProgramOnlyIntegers.start();

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String path = "/tmp/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null && !line.isEmpty()) {
                String[] fields = line.split(",");

                list.add(new Product(fields[0], Double.parseDouble(fields[1])));

                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive: ");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}