package aula2.Exercicios;

public class Exercicio7 {
    public static void main(String[] args) {
        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;

        System.out.println("cond1 && cond2: " + (cond1 && cond2)); // E (AND)
        System.out.println("cond1 || cond2: " + (cond1 || cond2)); // OU (OR)
        System.out.println("cond1 && cond3: " + (cond1 && cond3));
        System.out.println("(cond1 && cond2) || cond3: " + ((cond1 && cond2) || cond3));
    }
}
