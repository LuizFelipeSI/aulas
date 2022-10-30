package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main24 {

    public static void main (String[] args) throws IOException {

        // Desvendando Monty Hall

        Scanner leitura = new Scanner (System.in);

        int n = leitura.nextInt();
        int vitoria = 0;

        if (n > 0 && n < 10001) {
            for (int i = 0; i < n; i++) {
                int porta = leitura.nextInt();

                if (porta == 2 || porta == 3) {
                    vitoria++;
                } else if (porta == 1) {

                } else {
                    System.out.println("comando inválido");
                }
            }
        }
        System.out.println(vitoria);
    }
}
