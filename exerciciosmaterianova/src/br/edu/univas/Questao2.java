package br.edu.univas;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("digite o ano do seu nascimento:");
        int ano = leitura.nextInt();
        int idade = idade(ano);
        System.out.println("Você tem " + idade + " anos");

    }

    public static int idade(int ano) {

        int anoAtual = 2022;
        ano = anoAtual - ano;

        return ano;
    }
}
