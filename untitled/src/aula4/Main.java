package aula4;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1: Contagem Regressiva
        System.out.println("--- Exercício 1 ---");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Fim!");

        // Exercício 2: Soma de Números Pares
        System.out.println("\n--- Exercício 2 ---");
        int iEx2 = 1;
        int somaEx2 = 0;

        while (iEx2 <= 100) {
            if (iEx2 % 2 == 0) {
                somaEx2 = somaEx2 + iEx2;
            }
            iEx2++;
        }
        System.out.println("Soma dos pares: " + somaEx2);

        // Exercício 3: Cálculo de Fatorial
        System.out.println("\n--- Exercício 3 ---");
        System.out.print("Digite um número inteiro positivo: ");
        int numeroEx3 = scanner.nextInt();
        int fatorial = 1;
        int iEx3 = numeroEx3;

        do {
            fatorial = fatorial * iEx3;
            iEx3--;
        } while (iEx3 > 0);
        System.out.println("Fatorial: " + fatorial);

        // Exercício 4: Verificação de Número Primo
        System.out.println("\n--- Exercício 4 ---");
        System.out.print("Digite um número inteiro positivo: ");
        int numeroEx4 = scanner.nextInt();
        boolean ehPrimo = true;

        if (numeroEx4 <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i < numeroEx4; i++) {
                if (numeroEx4 % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numeroEx4 + " é primo");
        } else {
            System.out.println(numeroEx4 + " não é primo");
        }

        // Exercício 5: Média de Notas
        System.out.println("\n--- Exercício 5 ---");
        double somaEx5 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaEx5 = somaEx5 + nota;
        }
        double media = somaEx5 / 5;
        System.out.println("Média: " + media);

        // Exercício 6: Sequência Fibonacci
        System.out.println("\n--- Exercício 6 ---");
        int termo1 = 0;
        int termo2 = 1;
        int contador = 1;

        while (contador <= 10) {
            System.out.println(termo1);
            int proximo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximo;
            contador++;
        }

        // Exercício 7: Validação de Entrada
        System.out.println("\n--- Exercício 7 ---");
        double notaValidada;

        do {
            System.out.print("Digite uma nota de 0 a 10: ");
            notaValidada = scanner.nextDouble();
        } while (notaValidada < 0 || notaValidada > 10);
        System.out.println("Nota válida: " + notaValidada);

        // Exercício 8: Contagem de Números Pares e Ímpares
        System.out.println("\n--- Exercício 8 ---");
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

        // Exercício 9: Jogo de Adivinhação
        System.out.println("\n--- Exercício 9 ---");
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int palpite;
        int tentativas = 0;

        do {
            System.out.print("Adivinhe o número (1 a 100): ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Maior");
            } else if (palpite > numeroSecreto) {
                System.out.println("Menor");
            }
        } while (palpite != numeroSecreto);
        System.out.println("Acertou em " + tentativas + " tentativas!");

        // Exercício 10: Verificação de Números Pares e Ímpares com Interrupção
        System.out.println("\n--- Exercício 10 ---");
        String listaPares = "";
        String listaImpares = "";

        while (true) {
            System.out.print("Digite um número (negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero > 100) {
                System.out.println("Número muito grande, interrupção realizada");
                break;
            }

            if (numero % 2 == 0) {
                listaPares = listaPares + numero + " ";
                continue;
            } else {
                listaImpares = listaImpares + numero + " ";
                continue;
            }
        }

        System.out.println("Pares: " + listaPares);
        System.out.println("Ímpares: " + listaImpares);

        scanner.close();
    }
}
