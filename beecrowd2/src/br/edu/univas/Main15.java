package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main15 {

    public static void main (String[] args) throws IOException {

        // Menor e posição

        Scanner leitura = new Scanner (System.in);

        int n = leitura.nextInt();
        int menor = 0;
        int posicao = 0;
        int[] numeros = new int [n];

        for(int i = 0; i < n; i++) {
            numeros[i] = leitura.nextInt();

            if (i == 0) {
                menor = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
    }
}
