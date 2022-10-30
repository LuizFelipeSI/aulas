package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main9 {

    public static void main (String[] args) throws IOException {

        // Soma de pares consecutivos

        Scanner leitura = new Scanner (System.in);

       while (true) {

           int n = leitura.nextInt();
           if (n == 0) {
               break;
           } else if (n % 2 == 0) {
              n = n + (n+2) + (n+4) + (n+6) + (n+8);
              System.out.println(n);
           } else if (n % 2 !=0) {
               n = n+1 + (n+3) + (n+5) + (n+7) + (n+9);
               System.out.println(n);
           }
       }
    }
}

