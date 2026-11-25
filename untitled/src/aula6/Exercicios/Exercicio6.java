package aula6.Exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean ehPar = verificarPar(numero);

        if (ehPar) {
            System.out.println("O número " + numero + " é PAR (true).");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR (false).");
        }

        scanner.close();
    }

    public static boolean verificarPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}