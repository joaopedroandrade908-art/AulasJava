package aula2.Exercicios;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor pago por hora: ");
        int valorPorHora = scanner.nextInt();

        int salarioTotal = horasTrabalhadas * valorPorHora;

        System.out.println("--- Resumo de Pagamento ---");
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor por Hora: R$ " + valorPorHora);
        System.out.println("Salário Total: R$ " + salarioTotal);

        scanner.close();
    }
}