package br.edu.univas;

public class StartApp {

    public static void main(String[] args) {
        double valor = soma(10, 16);
        System.out.println("Soma: " + valor);

        valor = subtracao(10, 16);
        System.out.println("Subtração: " + valor);

        valor = divisao(10, 16);
        System.out.println("Divisão: " + valor);

        valor = multiplicacao(10,16);
        System.out.println("Multiplicação: " + valor);
    }

    public static double soma(int a, int b) {
        return a + b;
    }

    public static double subtracao(int a, int b) {
        return a - b;
    }

    public static double divisao(int a, int b) {
        return (double) a / b;
    }

    public static double multiplicacao(int a, int b) {
        double valor = a * b;
        return valor;
    }
}
