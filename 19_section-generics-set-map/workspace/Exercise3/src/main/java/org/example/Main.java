package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.next();
        Map<String, Integer> map = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if (map.containsKey(name)) {
                    map.put(name, map.get(name) + votes);
                } else {
                    map.put(name, votes);
                }

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + ": " + m.getValue());
        }
        sc.close();
    }
}