package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main17 {

    public static void main (String[] args) throws IOException {

        // Funções

        Scanner leitura = new Scanner (System.in);

        int testes = leitura.nextInt();
        double rafael;
        double beto;
        double carlos;

        for (int i = 0; i < testes; i++) {
            int x = leitura.nextInt();
            int y = leitura.nextInt();

            rafael = Math.pow((3*x),2) + Math.pow(y,2);
            beto = 2*Math.pow(x,2) + Math.pow((5*y),2);
            carlos = -100*x+Math.pow(y,3);

            if (rafael > beto && rafael > carlos) {
                System.out.println("Rafael ganhou");
            } else if (beto > rafael && beto > carlos) {
                System.out.println("Beto ganhou");
            } else if (carlos > rafael && carlos > beto) {
                System.out.println("Carlos ganhou");
            }
        }
    }
}
