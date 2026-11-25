package aula5.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] valores = new boolean[8];
        int contadorTrue = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite true ou false para a posição " + i + ": ");
            valores[i] = scanner.nextBoolean();

            if (valores[i] == true) {
                contadorTrue = contadorTrue + 1;
            }
        }

        System.out.println("Quantidade de valores 'true' inseridos: " + contadorTrue);

        scanner.close();
    }
}