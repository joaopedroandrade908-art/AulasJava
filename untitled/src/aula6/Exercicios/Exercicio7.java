package aula6.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = scanner.nextInt();

        int maior = maiorNumero(n1, n2, n3);
        System.out.println("O maior número informado é: " + maior);

        scanner.close();
    }

    public static int maiorNumero(int a, int b, int c) {
        int maior = a;

        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        return maior;
    }
}