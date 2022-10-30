package br.edu.univas;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Questao3 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        do {
            System.out.println("--------------------");
            System.out.println("1. Soma");
            System.out.println("2. Substração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("9. Sair");
            System.out.println("--------------------");
            String n = leitura.next();

            if (Pattern.matches("[a-zA-Z]+", n)) {
                System.out.println("Somente números são válidos!");

            } else {

                double resultado = 0;
                int numero = Integer.parseInt(n);

                if (numero == 1) {
                    System.out.println("Digite dois números:");
                    double primeiroNumero = leitura.nextDouble();
                    double segundoNumero = leitura.nextDouble();
                    resultado = soma(primeiroNumero, segundoNumero);

                } else if (numero == 2) {
                    System.out.println("Digite dois números:");
                    double primeiroNumero = leitura.nextDouble();
                    double segundoNumero = leitura.nextDouble();
                    resultado = subtracao(primeiroNumero, segundoNumero);

                } else if (numero == 3) {
                    System.out.println("Digite dois números:");
                    double primeiroNumero = leitura.nextDouble();
                    double segundoNumero = leitura.nextDouble();
                    resultado = multiplicacao(primeiroNumero, segundoNumero);

                } else if (numero == 4) {
                    System.out.println("Digite dois números:");
                    double primeiroNumero = leitura.nextDouble();
                    double segundoNumero = leitura.nextDouble();
                    resultado = divisao(primeiroNumero, segundoNumero);

                } else if (numero == 9) {
                    System.out.println("Programa encerrado!");
                    break;

                } else {
                    System.out.println("Opção inválida! Por favor, digite a opção correta!");

                }

                System.out.println(resultado);
            }

        } while (true);
    }

    public static double soma(double primeiro, double segundo) {

        primeiro += segundo;

        return primeiro;
    }

    public static double subtracao(double primeiro, double segundo) {

        primeiro -= segundo;

        return primeiro;
    }

    public static double multiplicacao(double primeiro, double segundo) {

        primeiro *= segundo;

        return primeiro;

    }

    public static double divisao(double primeiro, double segundo) {

        primeiro /= segundo;

        return primeiro;

    }
}