package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) throws IOException {

        //mês

        Scanner leitura = new Scanner (System.in);

        int mes = leitura.nextInt();

        if(mes == 1) {
            System.out.println("January");
        }
        if(mes == 2) {
            System.out.println("February");
        }
        if(mes == 3) {
            System.out.println("March");
        }
        if(mes == 4) {
            System.out.println("April");
        }
        if(mes == 5) {
            System.out.println("May");
        }
        if(mes == 6) {
            System.out.println("June");
        }
        if(mes == 7) {
            System.out.println("July");
        }
        if(mes == 8) {
            System.out.println("August");
        }
        if(mes == 9) {
            System.out.println("September");
        }
        if(mes == 10) {
            System.out.println("October");
        }
        if(mes == 11) {
            System.out.println("November");
        }
        if(mes == 12) {
            System.out.println("December");
        }
    }
}