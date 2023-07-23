package application;

import exercices.Exercise01;
import exercices.Exercise02;
import exercices.Exercise03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        String[] exercicesList = {"Employee", "Student", "Rectangle"};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < exercicesList.length; i++) {
            System.out.printf("[%d]: %s%n", i + 1, exercicesList[i]);
        }

        System.out.print("Select a exercise number: ");
        int code = sc.nextInt();
        switch (code) {
            case 1:
                Exercise01.run();
                break;
            case 2:
                Exercise02.run();
                break;
            case 3:
                Exercise03.run();
                break;
            default:
                System.out.println("Invalid number, please, enter number again!");
                break;
        }
    }
}