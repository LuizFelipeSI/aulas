package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) throws IOException {

        //média 1

        Scanner Leitura = new Scanner(System.in);

        double a = Leitura.nextDouble();
        double b = Leitura.nextDouble();
        double MEDIA = (a * 3.5) + (b * 7.5);
        double c = MEDIA / 11;

        System.out.println("MEDIA = " +String.format("%.5f", c ));
    }
}