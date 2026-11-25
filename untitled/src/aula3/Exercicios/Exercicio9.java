package aula3.Exercicios;

public class Exercicio9 {
    public static void main(String[] args) {
        int hora = 14;

        if (hora >= 5 && hora < 12) {
            System.out.println("Manhã");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Tarde");
        } else if (hora >= 18 && hora < 22) {
            System.out.println("Noite");
        } else {
            System.out.println("Madrugada");
        }
    }
}