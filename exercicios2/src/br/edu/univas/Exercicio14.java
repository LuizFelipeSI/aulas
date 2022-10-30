package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("digite o nome:");
        String nome = leitura.next();
        System.out.println("horas trabalhadas:");
        int horas = leitura.nextInt();
        System.out.println("salario por hora:");
        float shoras = leitura.nextFloat();

        float sdia = horas * shoras;

        System.out.println("Sr(a). " + nome + " irá receber R$ " + sdia);
    }
}