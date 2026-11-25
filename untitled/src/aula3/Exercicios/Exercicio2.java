package aula3.Exercicios;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        int valorProduto = scanner.nextInt();


        if (valorProduto > 100) {
            valorProduto = (int)(valorProduto * 0.9);


        }

        System.out.println("Valor final: " + valorProduto);


    }
}
