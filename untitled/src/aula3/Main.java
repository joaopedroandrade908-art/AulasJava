package aula3;

public class Main {
    public static void main(String[] args) {

        // Exercício 1: Verificação de Acesso a Sistema
        System.out.println("--- Exercício 1 ---");
        int idade = 20;

        if (idade >= 18) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

        // Exercício 2: Desconto em Compra
        System.out.println("\n--- Exercício 2 ---");
        double valorCompra = 150.0;
        double valorFinal;

        if (valorCompra > 100) {
            valorFinal = valorCompra * 0.90;
        } else {
            valorFinal = valorCompra;
        }

        System.out.println("Valor final: " + valorFinal);

        // Exercício 3: Classificação de Produto
        System.out.println("\n--- Exercício 3 ---");
        int codigo = 2;

        switch (codigo) {
            case 1:
                System.out.println("Eletrônicos");
                break;
            case 2:
                System.out.println("Alimentos");
                break;
            case 3:
                System.out.println("Vestuário");
                break;
            default:
                System.out.println("Código inválido");
                break;
        }

        // Exercício 4: Cálculo de Comissão
        System.out.println("\n--- Exercício 4 ---");
        double vendas = 3000.0;
        double comissao;

        if (vendas < 1000) {
            comissao = vendas * 0.05;
        } else if (vendas <= 5000) {
            comissao = vendas * 0.10;
        } else {
            comissao = vendas * 0.15;
        }

        System.out.println("Comissão: " + comissao);

        // Exercício 5: Cálculo de Horas Extras
        System.out.println("\n--- Exercício 5 ---");
        int horasTrabalhadas = 45;
        double valorHoraNormal = 20.0;

        if (horasTrabalhadas > 40) {
            int horasExtras = horasTrabalhadas - 40;
            double valorHoraExtra = valorHoraNormal * 1.5;
            double valorPagar = horasExtras * valorHoraExtra;
            System.out.println("Valor das horas extras: " + valorPagar);
        } else {
            System.out.println("Não fez horas extras");
        }

        // Exercício 6: Verificação de Nota
        System.out.println("\n--- Exercício 6 ---");
        double nota = 6.5;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Exercício 7: Escolha de Operação
        System.out.println("\n--- Exercício 7 ---");
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

        // Exercício 8: Avaliação de Desempenho
        System.out.println("\n--- Exercício 8 ---");
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

        // Exercício 9: Determinação de Turno
        System.out.println("\n--- Exercício 9 ---");
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

        // Exercício 10: Conversão de Moedas
        System.out.println("\n--- Exercício 10 ---");
        double valorReais = 100.0;
        int moedaDestino = 1;

        switch (moedaDestino) {
            case 1:
                System.out.println("Valor em Dólar: " + (valorReais / 5.0));
                break;
            case 2:
                System.out.println("Valor em Euro: " + (valorReais / 5.4));
                break;
            case 3:
                System.out.println("Valor em Libra: " + (valorReais / 6.3));
                break;
            default:
                System.out.println("Moeda inválida");
                break;
        }
    }
}