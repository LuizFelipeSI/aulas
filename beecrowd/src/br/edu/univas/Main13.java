package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main13 {

    public static void main(String[] args) throws IOException {

        //tri-du

        Scanner leitura = new Scanner(System.in);

        int i = 0;
        int r = 0;

        while (i == 0) {
            int carta1 = leitura.nextInt();
            if (carta1 < 1 || carta1 > 13) {
            } else {
                i = carta1;
            }
        }

        while (r == 0) {
            int carta2 = leitura.nextInt();
            if (carta2 < 1 || carta2 > 13) {
            } else {
                r = carta2;
            }

            if (i == r) {
                System.out.println(i);
            } else if (i > r) {
                System.out.println(i);
            } else {
                System.out.println(r);
            }
        }
    }
}