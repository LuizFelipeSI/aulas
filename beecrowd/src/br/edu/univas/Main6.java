package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) throws IOException {

        //distância entre dois pontos

        Scanner leitura = new Scanner (System.in);

        double x1 = leitura.nextDouble();
        double y1 = leitura.nextDouble();
        double x2 = leitura.nextDouble();
        double y2 = leitura.nextDouble();
        double distancia = Math.sqrt((x2 - x1)*(x2 - x1)+(y2 - y1)*(y2 - y1));

        System.out.println(String.format("%.4f", distancia));

    }
}