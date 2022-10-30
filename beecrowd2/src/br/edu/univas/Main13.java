package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main13 {

    public static void main (String[] args) throws IOException {

        // Preenchimento de vetor 1

        Scanner leitura = new Scanner (System.in);

        int n = leitura.nextInt();
        int[] numeros = new int[10];
        numeros[0] = n;

        for(int i = 1; i < 10; i++) {
            numeros[i] = numeros[i-1]*2;
        }

        for(int j = 0; j < 10; j++) {
            System.out.println("N[" + j + "] = " + numeros[j]);
        }
    }
}
