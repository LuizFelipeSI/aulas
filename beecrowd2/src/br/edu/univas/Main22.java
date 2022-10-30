package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main22 {

    public static void main (String[] args) throws IOException {

        // Cartas

        Scanner leitura = new Scanner (System.in);

        int[] cartas = new int[5];

        for(int i = 0; i < 5; i++) {
            cartas[i] = leitura.nextInt();
            if (cartas[i] < 1 || cartas[i] > 13) {
                break;
            }
        }
        if (cartas[0] < cartas[1]) {
            if (cartas[1] < cartas[2]) {
                if (cartas[2] < cartas[3]) {
                    if (cartas[3] < cartas[4]) {
                        System.out.println("C");
                    } else {
                        System.out.println("N");
                    }
                } else {
                    System.out.println("N");
                }
            } else {
                System.out.println("N");
            }
        } else if (cartas[1] > cartas[2]) {
            if (cartas[2] > cartas[3]) {
                if (cartas[3] > cartas[4]) {
                    System.out.println("D");
                } else {
                    System.out.println("N");
                }
            } else {
                System.out.println("N");
            }
        } else {
            System.out.println("N");
        }
    }
}
