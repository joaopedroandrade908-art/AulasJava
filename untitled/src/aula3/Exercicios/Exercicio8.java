package aula3.Exercicios;

public class Exercicio8 {
    public static void main(String[] args) {
        int notaDesempenho = 4;

        switch (notaDesempenho) {
            case 1:
                System.out.println("Precisa melhorar");
                break;
            case 2:
                System.out.println("Abaixo da média");
                break;
            case 3:
                System.out.println("Média");
                break;
            case 4:
                System.out.println("Acima da média");
                break;
            case 5:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Nota inválida");
                break;
        }
    }
}