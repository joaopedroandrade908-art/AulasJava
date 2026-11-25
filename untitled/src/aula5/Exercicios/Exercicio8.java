package aula5.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] tabela = new double[2][2];

        System.out.println("Preencha a matriz 2x2 de números reais:");
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela[i].length; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                tabela[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nResultado da soma por linha:");
        for (int i = 0; i < tabela.length; i++) {
            double somaLinha = 0;
            for (int j = 0; j < tabela[i].length; j++) {
                somaLinha = somaLinha + tabela[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
        }

        scanner.close();
    }
}