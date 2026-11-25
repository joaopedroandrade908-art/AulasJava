package aula2.Exercicios;

import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        double numeroDouble = numeroInteiro;

        System.out.println("Valor inteiro original: " + numeroInteiro);
        System.out.println("Valor convertido para double: " + numeroDouble);

        scanner.close();
    }
}