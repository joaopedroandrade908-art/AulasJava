package aula4.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pares = "";
        String impares = "";

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
                pares = pares + numero + " ";
                continue;
            } else {
                impares = impares + numero + " ";
                continue;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

        scanner.close();
    }
}