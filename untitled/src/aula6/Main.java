package aula6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1: Função que Imprime uma Mensagem
        System.out.println("--- Exercício 1 ---");
        imprimirSaudacao();

        // Exercício 2: Função que Soma Dois Números
        System.out.println("\n--- Exercício 2 ---");
        System.out.print("Digite o primeiro número inteiro: ");
        int num1Ex2 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2Ex2 = scanner.nextInt();

        int resultadoSoma = somar(num1Ex2, num2Ex2);
        System.out.println("A soma dos dois números é: " + resultadoSoma);

        // Exercício 3: Função para Calcular o Dobro de um Número
        System.out.println("\n--- Exercício 3 ---");
        System.out.print("Digite um número inteiro: ");
        int numEx3 = scanner.nextInt();

        int resultadoDobro = dobrar(numEx3);
        System.out.println("O dobro de " + numEx3 + " é: " + resultadoDobro);

        // Exercício 4: Função para Converter Graus Celsius para Fahrenheit
        System.out.println("\n--- Exercício 4 ---");
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = converterCelsiusParaFahrenheit(celsius);
        System.out.println(celsius + "°C equivalem a " + fahrenheit + "°F.");

        // Exercício 5: Função para Calcular a Média de Três Notas
        System.out.println("\n--- Exercício 5 ---");
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);
        System.out.println("A média final do aluno é: " + media);

        // Exercício 6: Função para Verificar se um Número é Par
        System.out.println("\n--- Exercício 6 ---");
        System.out.print("Digite um número inteiro: ");
        int numEx6 = scanner.nextInt();

        boolean ehPar = verificarPar(numEx6);
        if (ehPar) {
            System.out.println("O número " + numEx6 + " é PAR (true).");
        } else {
            System.out.println("O número " + numEx6 + " é ÍMPAR (false).");
        }

        // Exercício 7: Função para Determinar o Maior de Três Números
        System.out.println("\n--- Exercício 7 ---");
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = scanner.nextInt();

        int maior = maiorNumero(n1, n2, n3);
        System.out.println("O maior número informado é: " + maior);

        // Exercício 8: Função que Calcula o Fatorial de um Número
        System.out.println("\n--- Exercício 8 ---");
        System.out.print("Digite um número inteiro positivo: ");
        int numEx8 = scanner.nextInt();

        int resultadoFatorial = calcularFatorial(numEx8);
        System.out.println("O fatorial de " + numEx8 + " é: " + resultadoFatorial);

        // Exercício 9: Função para Calcular a Potência de Um Número
        System.out.println("\n--- Exercício 9 ---");
        System.out.print("Digite o valor da base (inteiro): ");
        int base = scanner.nextInt();
        System.out.print("Digite o valor do expoente (inteiro): ");
        int expoente = scanner.nextInt();

        int resultadoPotencia = calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é igual a: " + resultadoPotencia);

        // Exercício 10: Função para Calcular o IMC
        System.out.println("\n--- Exercício 10 ---");
        System.out.print("Digite o seu peso em kg (ex: 70.5): ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        System.out.println("O seu Índice de Massa Corporal (IMC) é: " + imc);

        scanner.close();
    }

    // --- FUNÇÕES DOS EXERCÍCIOS ---

    // Exercício 1
    public static void imprimirSaudacao() {
        System.out.println("Bem-vindo ao sistema!");
    }

    // Exercício 2
    public static int somar(int a, int b) {
        return a + b;
    }

    // Exercício 3
    public static int dobrar(int numero) {
        return numero * 2;
    }

    // Exercício 4
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    // Exercício 5
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // Exercício 6
    public static boolean verificarPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Exercício 7
    public static int maiorNumero(int a, int b, int c) {
        int maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        return maior;
    }

    // Exercício 8
    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }

    // Exercício 9
    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

    // Exercício 10
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}