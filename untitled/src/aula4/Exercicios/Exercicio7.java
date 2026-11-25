package aula4.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida informada: " + nota);

        scanner.close();
    }
}