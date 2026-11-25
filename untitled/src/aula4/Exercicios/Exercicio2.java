package aula4.Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int soma = 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                soma = soma + i;
            }
            i++;
        }

        System.out.println("Soma dos pares de 1 a 100: " + soma);

        scanner.close();
    }
}