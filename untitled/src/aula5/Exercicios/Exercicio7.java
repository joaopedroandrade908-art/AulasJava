package aula5.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int soma = 0;

        System.out.println("Preencha a matriz 2x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um número inteiro para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma = soma + matriz[i][j];
            }
        }

        System.out.println("A soma total dos valores da matriz é: " + soma);

        scanner.close();
    }
}