package aula2.Exercicios;

public class Exercicio9 {
    public static void main(String[] args) {
        float valorFloat = 45.75f;

        // Casting explícito de float para long (perde a parte decimal)
        long valorLong = (long) valorFloat;

        // Casting implícito de long para double (automático)
        double valorDouble = valorLong;

        System.out.println("Valor float: " + valorFloat);
        System.out.println("Valor long (casting explícito): " + valorLong);
        System.out.println("Valor double (casting implícito): " + valorDouble);
    }
}