package aula2.Exercicios;

public class Exercicio10 {
    public static void main(String[] args) {
        short valorShort = 120;

        // Casting implícito de short para int (automático)
        int valorInt = valorShort;

        // Casting explícito de short para byte (manual)
        byte valorByte = (byte) valorShort;

        System.out.println("Valor short: " + valorShort);
        System.out.println("Valor int (casting implícito): " + valorInt);
        System.out.println("Valor byte (casting explícito): " + valorByte);
    }
}