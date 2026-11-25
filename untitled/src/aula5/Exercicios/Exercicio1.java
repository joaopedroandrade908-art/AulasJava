package aula5.Exercicios;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}