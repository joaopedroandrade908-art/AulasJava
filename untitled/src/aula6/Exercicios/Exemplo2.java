package aula6.Exercicios;

import java.util.Scanner;

public class Exemplo2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("""
                Escreva seus dados pessoais:
                    Nome: """);
        String nome = sc.nextLine();
        System.out.printf("""
                    \tIdade: """);


        int idade = sc.nextInt();
        imprimirDadosPessoais(idade, nome);

    }
    public static void imprimirDadosPessoais(int idade, String nome){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

