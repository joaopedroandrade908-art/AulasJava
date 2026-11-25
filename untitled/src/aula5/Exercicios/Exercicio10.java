package aula5.Exercicios;

public class Exercicio10 {
    public static void main(String[] args) {
        int[][] matriz = {
                {12, 45, 7},
                {89, 23, 54}
        };

        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("O maior valor armazenado na matriz é: " + maior);
    }
}
