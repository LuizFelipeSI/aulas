package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main1 {

    public static void main (String[] args) throws IOException {

        // Esfera

        Scanner leitura = new Scanner (System.in);

        double raio = leitura.nextDouble();
        double volume = (4/3.0)*3.14159*(Math.pow(raio,3));

        System.out.println(String.format("VOLUME = %.3f", volume));

    }
}
