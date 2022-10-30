package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main18 {

    public static void main(String[] args) throws IOException {

        // Baralho embaralhado

        Scanner leitura = new Scanner(System.in);

        int p = leitura.nextInt();
        int x = 2;
        int contador = 1;

        while (x != 1) {
            int media = p/2;
            if (x <= media) {
                x += x;
            } else {
                x -= p - x + 1;
            }
            contador++;
        }
        System.out.println(contador);
    }
}

