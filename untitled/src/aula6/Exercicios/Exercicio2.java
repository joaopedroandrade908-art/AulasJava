package aula6.Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int resultado = somar(num1, num2);
        System.out.println("A soma dos dois números é: " + resultado);

        scanner.close();
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}