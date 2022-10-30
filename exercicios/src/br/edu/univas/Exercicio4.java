package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite x");
        int x = leitura.nextInt();
        System.out.println("Digite y");
        int y = leitura.nextInt();
        int z = (x%y);
        if (z == 0) {
            System.out.println("Divisão de " + x + " por " + y + " é perfeita");
        } else {
            System.out.println("Divisão de " + x + " por " + y + " sobra: " + z);
        }
    }
}