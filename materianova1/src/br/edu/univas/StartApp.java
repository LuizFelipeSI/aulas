package br.edu.univas;

import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Hello World!");
        System.out.println("Digite dois números:");
        int a = leitura.nextInt();
        int b = leitura.nextInt();
        soma(b, a);
        soma(25, 66);
        soma(100, 900);
        subtracao(a, b);
        multiplicacao(a, b);
        divisao(a, b);
        System.out.println("Bye Bye");
    }

    public static void soma(int a, int b) {
        int soma = a + b;
        System.out.println("soma: " + soma);
    }

    public static void subtracao(int a, int b) {
        int subtracao = a - b;
        System.out.println("subtracao: " + subtracao);
    }

    public static void multiplicacao(int a, int b) {
        int multiplicacao = a * b;
        System.out.println("multiplicação: " + multiplicacao);
    }

    public static void divisao(float x, float y) {
        float divisao = x / y;
        System.out.println("divisão: " + divisao);
    }
}
