package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main11 {

    public static void main (String[] args) throws IOException {

        // Blobs

        Scanner leitura = new Scanner (System.in);

        int dias;
        int n = leitura.nextInt();

        for (int i = 0; i < n; i++) {
            double comida = leitura.nextDouble();
            dias = 0;

            while (comida > 1) {

                comida = comida/2;
                dias++;

            }
            System.out.println(dias + " dias");
        }
    }
}
