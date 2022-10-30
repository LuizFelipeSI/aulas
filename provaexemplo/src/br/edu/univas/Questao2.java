package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Questao2 {

    public static void main (String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            String temp = "";
            for (int j = 0; j < i; j++) {
                temp += "*";
            }

            System.out.println(temp);
        }

        // OU

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
