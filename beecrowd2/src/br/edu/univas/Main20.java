package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main20 {

    public static void main (String[] args) throws IOException {

        // Cachorros-quentes

        Scanner leitura = new Scanner (System.in);

        int h = leitura.nextInt();
        int p = leitura.nextInt();

        float media = (float)h/p;

        System.out.println(String.format("%.2f", media));

    }
}
