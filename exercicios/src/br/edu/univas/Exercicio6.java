package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o preço da gasolina:");
        float gas = leitura.nextFloat();
        System.out.println("Digite o preço do etanol");
        float eta = leitura.nextFloat();
        float mp = (eta/gas)*100;

        if (mp > 70f) {
            System.out.println("Gasolina");
        } else
            System.out.println("Etanol");
    }
}