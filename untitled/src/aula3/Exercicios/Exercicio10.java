package aula3.Exercicios;

public class Exercicio10 {
    public static void main(String[] args) {
        double valorReais = 100.0;
        int moedaDestino = 1;

        switch (moedaDestino) {
            case 1:
                System.out.println("Valor em Dólar: " + (valorReais / 5.0));
                break;
            case 2:
                System.out.println("Valor em Euro: " + (valorReais / 5.4));
                break;
            case 3:
                System.out.println("Valor em Libra: " + (valorReais / 6.3));
                break;
            default:
                System.out.println("Moeda inválida");
                break;
        }
    }
}