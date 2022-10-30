package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main15 {

    public static void main (String[] args) throws IOException {

        //máquina de café

        Scanner leitura = new Scanner(System.in);

        int a = leitura.nextInt();
        int b = leitura.nextInt();
        int c = leitura.nextInt();
        int soma1 = (a*2) + (c*2);
        int soma2 = (b*2) + (c*4);
        int soma3 = (a*4) + (b*2);

       if (soma1<soma2 && soma1<soma3) {
           System.out.println(soma1);
       } else if (soma2<soma3) {
           System.out.println(soma2);
       } else {
           System.out.println(soma3);
       }
    }
}
