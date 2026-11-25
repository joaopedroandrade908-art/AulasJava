package aula4.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int palpite;
        int tentativas = 0;

        do {
            System.out.print("Adivinhe o número (1 a 100): ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número é maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é menor!");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s).");

        scanner.close();
    }
}