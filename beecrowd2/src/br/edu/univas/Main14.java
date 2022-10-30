package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main14 {

    public static void main (String[] args) throws IOException {

        // Troca em vetor 1

        Scanner leitura = new Scanner (System.in);

        int[] numeros = new int[20];

        for (int i = 0; i < 20; i++) {
            numeros[i] = leitura.nextInt();
        }

        int j = 19;
        int aux;

        for (int i = 0; i < 10; i++) {
            aux = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = aux;
            j--;
        }

        for(int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + numeros[i]);
        }
    }
}
