package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main7 {

    public static void main (String[] args) throws IOException {

        // Sequência lógica

        Scanner leitura = new Scanner (System.in);

        int n = leitura.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println(i + " " + (i*i) + " " + (i*i*i));
            System.out.println(i + " " + ((i*i)+1) + " " + ((i*i*i)+1));
        }
    }
}
