package org.application;

import org.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * /tmp/in.txt
 * <p>
 * Maria,maria@gmail.com,3200.00
 * Alex,alex@gmail.com,1900.00
 * Marco,marco@gmail.com,1700.00
 * Bob,bob@gmail.com,3500.00
 * Anna,anna@gmail.com,2800.00
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                String name = fields[0];
                String email = fields[1];
                Double salary = Double.parseDouble(fields[2]);

                list.add(new Employee(name, email, salary));

                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            Double salaryInputed = sc.nextDouble();

            System.out.printf("Email of people whose salary is more than %.2f:%n", salaryInputed);
            List<String> emails = list.stream()
                    .filter(n -> n.getSalary() > salaryInputed)
                    .map(n -> n.getEmail())
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            Double sum = list.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (s1, s2) -> s1 + s2);

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f%n", sum);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}