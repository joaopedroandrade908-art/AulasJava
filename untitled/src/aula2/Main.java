package aula2;

public class Main {
    public static void main(String[] args) {

        // Exercício 1: Declaração e Inicialização de Variáveis[cite: 90]
        System.out.println("--- Exercício 1 ---");
        int idade = 25;
        float altura = 1.75f;
        double peso = 72.5;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);

        // Exercício 2: Operações Matemáticas Simples[cite: 90]
        System.out.println("\n--- Exercício 2 ---");
        int horasTrabalhadas = 160;
        int valorPorHora = 25;
        int salarioTotal = horasTrabalhadas * valorPorHora;

        System.out.println("Salário total: R$ " + salarioTotal);

        // Exercício 3: Casting Implícito[cite: 91]
        System.out.println("\n--- Exercício 3 ---");
        int valorInt = 50;
        double valorDouble = valorInt;

        System.out.println("Valor em double: " + valorDouble);

        // Exercício 4: Casting Explícito[cite: 91]
        System.out.println("\n--- Exercício 4 ---");
        double valorFracionado = 19.85;
        int valorInteiro = (int) valorFracionado;

        System.out.println("Valor double: " + valorFracionado);
        System.out.println("Valor int (com casting): " + valorInteiro);

        // Exercício 5: Operadores Aritméticos[cite: 92]
        System.out.println("\n--- Exercício 5 ---");
        int nota1 = 8;
        int nota2 = 7;
        int nota3 = 9;
        int somaTotal = nota1 + nota2 + nota3;

        System.out.println("Soma total das notas: " + somaTotal);

        // Exercício 6: Comparação de Dois Números[cite: 92]
        System.out.println("\n--- Exercício 6 ---");
        int num1 = 15;
        int num2 = 20;

        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));

        // Exercício 7: Operadores Lógicos Básicos[cite: 93]
        System.out.println("\n--- Exercício 7 ---");
        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;

        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 && cond3: " + (cond1 && cond3));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("cond2 || cond3: " + (cond2 || cond3));

        // Exercício 8: Cálculo de Área de um Retângulo[cite: 93]
        System.out.println("\n--- Exercício 8 ---");
        float largura = 5.5f;
        float alturaRetangulo = 3.2f;
        float area = largura * alturaRetangulo;

        System.out.println("Área do retângulo: " + area);

        // Exercício 9: Conversão de Tipos (Casting Implícito e Explícito)[cite: 94]
        System.out.println("\n--- Exercício 9 ---");
        float valorFloat = 45.75f;
        long valorLong = (long) valorFloat; // Casting explícito
        double valorDoubleEx9 = valorLong;  // Casting implícito

        System.out.println("Valor float: " + valorFloat);
        System.out.println("Valor long: " + valorLong);
        System.out.println("Valor double: " + valorDoubleEx9);

        // Exercício 10: Diferença Entre Tipos de Dados[cite: 95]
        System.out.println("\n--- Exercício 10 ---");
        short valorShort = 100;
        int valorIntEx10 = valorShort;         // Casting implícito
        byte valorByte = (byte) valorShort;    // Casting explícito

        System.out.println("Valor short: " + valorShort);
        System.out.println("Valor int: " + valorIntEx10);
        System.out.println("Valor byte: " + valorByte);
    }
}