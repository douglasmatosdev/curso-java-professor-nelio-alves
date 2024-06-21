package org.example.application;

import org.example.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String inputPath = "/tmp/input/products.csv";
        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {

            String line = br.readLine();
            while (line != null) {
                String[] lineSplited = line.split(",");
                list.add(
                        new Product(
                                lineSplited[0],
                                Double.parseDouble(lineSplited[1]),
                                Integer.parseInt(lineSplited[2])
                        )
                );
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        boolean success = new File("/tmp/out").mkdir();
        if (!success) {
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/tmp/out/summary.csv"))) {

            for (Product p : list) {
                System.out.println(p);
                bw.write(p.getName() + "," + String.format("%.2f", p.getAmount() * p.getValue()));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}