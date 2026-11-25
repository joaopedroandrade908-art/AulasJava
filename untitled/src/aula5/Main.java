package aula5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1: Soma de Elementos Inteiros em um Vetor
        System.out.println("--- Exercício 1 ---");
        int[] numerosEx1 = {10, 20, 30, 40, 50};
        int somaEx1 = 0;

        for (int i = 0; i < numerosEx1.length; i++) {
            somaEx1 = somaEx1 + numerosEx1[i];
        }
        System.out.println("A soma dos elementos do vetor é: " + somaEx1);

        // Exercício 2: Busca de Caracteres em um Vetor
        System.out.println("\n--- Exercício 2 ---");
        String[] letras = {"A", "B", "C", "D", "E", "F"};

        System.out.print("Digite uma letra para buscar no vetor: ");
        String letraBuscada = scanner.nextLine();

        boolean encontrada = false;

        for (int i = 0; i < letras.length; i++) {
            if (letras[i].equalsIgnoreCase(letraBuscada)) {
                System.out.println("A letra '" + letraBuscada + "' foi encontrada na posição (índice): " + i);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("A letra '" + letraBuscada + "' não está presente no vetor.");
        }

        // Exercício 3: Contagem de Valores Booleanos
        System.out.println("\n--- Exercício 3 ---");
        boolean[] valoresBooleanos = new boolean[8];
        int contadorTrue = 0;

        for (int i = 0; i < valoresBooleanos.length; i++) {
            System.out.print("Digite true ou false para a posição " + i + ": ");
            valoresBooleanos[i] = scanner.nextBoolean();

            if (valoresBooleanos[i] == true) {
                contadorTrue = contadorTrue + 1;
            }
        }
        System.out.println("Quantidade de valores 'true' inseridos: " + contadorTrue);

        // Exercício 4: Média de Notas (double)
        System.out.println("\n--- Exercício 4 ---");
        double[] notas = new double[4];
        double somaEx4 = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
            somaEx4 = somaEx4 + notas[i];
        }

        double media = somaEx4 / notas.length;
        System.out.println("A média das 4 notas é: " + media);

        // Limpa a quebra de linha pendente antes de ler String com nextLine()
        scanner.nextLine();

        // Exercício 5: Vetor de Strings
        System.out.println("\n--- Exercício 5 ---");
        String[] nomes = {"Ana", "Bruno", "Clara"};

        System.out.print("Qual nome você deseja verificar? ");
        String nomeBuscado = scanner.nextLine();

        boolean presente = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBuscado)) {
                presente = true;
                break;
            }
        }

        if (presente) {
            System.out.println("O nome " + nomeBuscado + " está presente no vetor!");
        } else {
            System.out.println("O nome " + nomeBuscado + " não foi encontrado no vetor.");
        }

        // Exercício 6: Preenchendo uma Matriz
        System.out.println("\n--- Exercício 6 ---");
        int[][] matrizEx6 = new int[2][2];

        System.out.println("Preencha a matriz 2x2:");
        for (int i = 0; i < matrizEx6.length; i++) {
            for (int j = 0; j < matrizEx6[i].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matrizEx6[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nValores inseridos na matriz:");
        for (int i = 0; i < matrizEx6.length; i++) {
            for (int j = 0; j < matrizEx6[i].length; j++) {
                System.out.println("Elemento na posição [" + i + "][" + j + "]: " + matrizEx6[i][j]);
            }
        }

        // Exercício 7: Soma de Valores em uma Matriz
        System.out.println("\n--- Exercício 7 ---");
        int[][] matrizEx7 = new int[2][3];
        int somaEx7 = 0;

        System.out.println("Preencha a matriz 2x3:");
        for (int i = 0; i < matrizEx7.length; i++) {
            for (int j = 0; j < matrizEx7[i].length; j++) {
                System.out.print("Digite um número inteiro para [" + i + "][" + j + "]: ");
                matrizEx7[i][j] = scanner.nextInt();
                somaEx7 = somaEx7 + matrizEx7[i][j];
            }
        }
        System.out.println("A soma total dos valores da matriz é: " + somaEx7);

        // Exercício 8: Matriz de Números Reais (double)
        System.out.println("\n--- Exercício 8 ---");
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

        // Exercício 9: Contando Números Pares em uma Matriz
        System.out.println("\n--- Exercício 9 ---");
        int[][] matrizEx9 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int pares = 0;

        for (int i = 0; i < matrizEx9.length; i++) {
            for (int j = 0; j < matrizEx9[i].length; j++) {
                if (matrizEx9[i][j] % 2 == 0) {
                    pares = pares + 1;
                }
            }
        }
        System.out.println("Quantidade de números pares na matriz 4x4: " + pares);

        // Exercício 10: Maior Elemento de uma Matriz
        System.out.println("\n--- Exercício 10 ---");
        int[][] matrizEx10 = {
                {12, 45, 7},
                {89, 23, 54}
        };

        int maior = matrizEx10[0][0];

        for (int i = 0; i < matrizEx10.length; i++) {
            for (int j = 0; j < matrizEx10[i].length; j++) {
                if (matrizEx10[i][j] > maior) {
                    maior = matrizEx10[i][j];
                }
            }
        }
        System.out.println("O maior valor armazenado na matriz é: " + maior);

        scanner.close();
    }
}
