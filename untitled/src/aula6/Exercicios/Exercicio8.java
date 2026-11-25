package aula6.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);

        scanner.close();
    }

    public static int calcularFatorial(int numero) {
        int fatorial = 1;

        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }

        return fatorial;
    }
}