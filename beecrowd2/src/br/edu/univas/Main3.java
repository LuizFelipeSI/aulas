package br.edu.univas;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main (String[] args) throws IOException {

        // Sort Simples

        Scanner leitura = new Scanner (System.in);

        int[] numeros = new int[3];
        int aux;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leitura.nextInt();
        }

        int a = numeros[0];
        int b = numeros[1];
        int c = numeros[2];


        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // OU

        Arrays.sort(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
