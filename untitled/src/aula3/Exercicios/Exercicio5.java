package aula3.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int horasTrabalhadas = 45;
        double valorHoraNormal = 20.0;

        if (horasTrabalhadas > 40) {
            int horasExtras = horasTrabalhadas - 40;
            double valorHoraExtra = valorHoraNormal * 1.5;
            double valorPagar = horasExtras * valorHoraExtra;
            System.out.println("Valor das horas extras: " + valorPagar);
        } else {
            System.out.println("Não fez horas extras");
        }
    }
}