package br.edu.univas;


import java.io.IOException;
import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) throws IOException {

        //números ímpares

        Scanner leitura = new Scanner (System.in);

        int num2 = leitura.nextInt();
        int num = 1;

        for ( num = 1; num <= num2; num++) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}






