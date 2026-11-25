package aula2.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();

        System.out.print("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.print("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();

        int somaTotal = nota1 + nota2 + nota3;

        System.out.println("\nNotas digitadas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Soma total das notas: " + somaTotal);

        scanner.close();
    }
}