package aula6.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso em kg (ex: 70.5): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        System.out.println("O seu Índice de Massa Corporal (IMC) é: " + imc);

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
