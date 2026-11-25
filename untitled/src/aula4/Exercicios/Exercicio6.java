package aula4.Exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        int termo1 = 0;
        int termo2 = 1;
        int contador = 1;

        while (contador <= 10) {
            System.out.println(termo1);
            int proximo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximo;
            contador++;
        }
    }
}