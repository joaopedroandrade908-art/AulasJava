package aula4.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        int i = numero;

        do {
            fatorial = fatorial * i;
            i--;
        } while (i > 0);

        System.out.println("Fatorial de " + numero + ": " + fatorial);

        scanner.close();
    }
}