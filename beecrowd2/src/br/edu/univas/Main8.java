package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main8 {

    public static void main (String[] args) throws IOException {

        // Sequência S

        Scanner leitura = new Scanner (System.in);

        double S = 1;

        for(double i = 2; i <= 100; i++){
            S = S + 1/i;
        }

        System.out.println(String.format("%.2f" , S));
    }
}
