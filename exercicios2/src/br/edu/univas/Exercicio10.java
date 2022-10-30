package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("digite 0 para mulher ou 1 para homem:");
        int genero = leitura.nextInt();
        System.out.println("digite a altura:");
        float altura = leitura.nextFloat();

        float pesoIdeal;
        if (genero == 0) {
            pesoIdeal = 62.1f * altura - 44.7f;
        } else {
            pesoIdeal = 72.7f * altura -58f;
        }
        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}