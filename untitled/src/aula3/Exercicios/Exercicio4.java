package aula3.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double vendas = 3000.0;
        double comissao;

        if (vendas < 1000) {
            comissao = vendas * 0.05;
        } else if (vendas <= 5000) {
            comissao = vendas * 0.10;
        } else {
            comissao = vendas * 0.15;
        }

        System.out.println("Comissão: " + comissao);
    }
}
