package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        //igual a questao 2 da primeira prova, mas resolvido um pouco diferente

        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}