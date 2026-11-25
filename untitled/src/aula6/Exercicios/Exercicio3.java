package aula6.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int resultado = dobrar(numero);
        System.out.println("O dobro de " + numero + " é: " + resultado);

        scanner.close();
    }

    public static int dobrar(int numero) {
        return numero * 2;
    }
}