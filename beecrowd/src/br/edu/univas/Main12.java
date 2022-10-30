package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) throws IOException {

        //tipo de combustível

        Scanner leitura = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int r = 1;

        while (r>0) {

           int tipo = leitura.nextInt();
           if (tipo <1 || tipo >4) {
           } else if (tipo == 1) {
               alcool++;
           } else if (tipo == 2) {
               gasolina++;
            } else if (tipo == 3) {
               diesel++;
           } else {
               r=0;
           }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool );
        System.out.println("Gasolina: " + gasolina );
        System.out.println("Diesel: " + diesel );
    }
}