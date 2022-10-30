package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main21 {

    public static void main (String[] args) throws IOException {

        // Andando no tempo

        Scanner leitura = new Scanner (System.in);

        int a = leitura.nextInt();
        int b = leitura.nextInt();
        int c = leitura.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("S");
        } else if (a + b == c || a + c == b || b + c == a) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
