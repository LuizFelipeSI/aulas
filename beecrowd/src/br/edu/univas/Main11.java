package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) throws IOException {

        //quadrante

        Scanner leitura = new Scanner(System.in);

        int i = 1;
        while (i>0) {

            int x = leitura.nextInt();
            int y = leitura.nextInt();
            if (x>0 && y>0) {
                System.out.println("primeiro");
            } else if (x>0 && y<0) {
                System.out.println("quarto");
            } else if (x<0 && y<0) {
                System.out.println("terceiro");
            } else if (x<0 && y>0) {
                System.out.println("segundo");
            } else  {
                i=0;
            }
        }
    }
}