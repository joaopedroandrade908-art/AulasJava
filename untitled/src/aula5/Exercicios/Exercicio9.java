package aula5.Exercicios;

public class Exercicio9 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int pares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares = pares + 1;
                }
            }
        }

        System.out.println("Quantidade de números pares na matriz 4x4: " + pares);
    }
}