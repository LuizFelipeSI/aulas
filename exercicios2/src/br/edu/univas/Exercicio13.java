package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        int a = leitura.nextInt();
        System.out.println("digite o segundo numero");
        int b = leitura.nextInt();
        System.out.println("digite o terceiro numero");
        int c = leitura.nextInt();
        System.out.println("digite o quarto numero");
        int d = leitura.nextInt();
        float diferenca = (a*b)-(c*d);
        System.out.println("a diferença é: " + diferenca);
    }
}