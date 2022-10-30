package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException {

        //média 2

        Scanner Leitura = new Scanner(System.in);

        double a = Leitura.nextDouble();
        double b = Leitura.nextDouble();
        double c = Leitura.nextDouble();
        double MEDIA = (a * 2.0) + (b * 3.0) + (c * 5.0);
        double d = MEDIA / 10;

        System.out.println("MEDIA = " +String.format("%.1f", d ));
    }
}