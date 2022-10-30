package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;


public class Exercicio8 {

    public static void main (String [] args) throws IOException {

        Scanner leitura = new Scanner (System.in);

        System.out.println("digite x ");
        int x = leitura.nextInt();
        System.out.println("digite y ");
        int y = leitura.nextInt();

        int aux = x;
        x = y;
        y = aux;

        System.out.println("os números trocados ficam: x = " + x + " y = " + y);
    }
}
