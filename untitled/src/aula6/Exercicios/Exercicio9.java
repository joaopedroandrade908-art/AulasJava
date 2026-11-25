package aula6.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base (inteiro): ");
        int base = scanner.nextInt();

        System.out.print("Digite o valor do expoente (inteiro): ");
        int expoente = scanner.nextInt();

        int resultado = calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);

        scanner.close();
    }

    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1;

        for (int i = 1; i <= expoente; i++) {
            resultado = resultado * base;
        }

        return resultado;
    }
}