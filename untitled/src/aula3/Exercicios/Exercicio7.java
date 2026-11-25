package aula3.Exercicios;

public class Exercicio7 {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        int operacao = 1;

        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Resultado: " + (num1 / num2));
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }
}