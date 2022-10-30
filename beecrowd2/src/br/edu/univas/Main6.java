package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main6 {

    public static void main (String[] args) throws IOException {

        // Positivos e média

        Scanner leitura = new Scanner (System.in);

        float[] numeros = new float[6];
        float somaPositivos = 0;
        int positivos = 0;

        for(int i = 0; i < 6; i++){
            numeros[i] = leitura.nextFloat();
            if (numeros[i] > 0){
                positivos++;
                somaPositivos = somaPositivos+numeros[i];
            }
        }

        float media = somaPositivos/positivos;
        System.out.println(positivos + " valores positivos");
        System.out.println(String.format("%.1f" , media));
    }
}
