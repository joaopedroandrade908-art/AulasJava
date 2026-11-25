package aula5.Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        scanner.close();
    }
}