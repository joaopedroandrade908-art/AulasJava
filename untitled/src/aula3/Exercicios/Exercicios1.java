package aula3.Exercicios;
import java.util.Scanner;

public class Exercicios1 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade < 18) {

            System.out.println("Você não tem a idade necessaria");
        }
        else {
            System.out.println("Você tem a idade necessaria");
        }
    }



}
