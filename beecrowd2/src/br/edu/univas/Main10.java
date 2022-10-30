package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) throws IOException {

        // Soma de fatoriais

        Scanner leitura = new Scanner(System.in);

        while (leitura.hasNext()) {

            long n = leitura.nextLong();
            long m = leitura.nextLong();

            if (n > 20 || m > 20 || n < 0 || m < 0) {
                break;

            } else {
                for (double i = n - 1; i > 0; i--) {
                    n *= i;
                }

                if (n == 0) {
                    n += 1;
                }

                for (double i = m - 1; i > 0; i--) {
                    m *= i;
                }

                if (m == 0) {
                    m += 1;
                }

                System.out.println(n + m);

            }
        }
    }
}
