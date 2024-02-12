import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double AVERAGE_TARGET = 6.0;

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %d° aluno: %n", i + 1);

            Aluno aluno = new Aluno(sc.nextLine());

            aluno.setNotes(0, sc.nextDouble());
            aluno.setNotes(1, sc.nextDouble());

            alunos[i] = aluno;
        }

        System.out.println("Alunos aprovados: ");
        for (Aluno aluno : alunos) {
            if (aluno.getAverage() >= AVERAGE_TARGET) {
                System.out.println(aluno.getName());
            }
        }
        sc.close();
    }
}