package aula5.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        scanner.close();
    }
}