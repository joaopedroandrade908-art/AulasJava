package aula2.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor decimal (ex: 99,98): ");
        double valorDecimal = scanner.nextDouble();

        int valorInteiro = (int) valorDecimal;

        System.out.println("Valor em double original: " + valorDecimal);
        System.out.println("Valor após casting explícito para int: " + valorInteiro);

        scanner.close();
    }
}