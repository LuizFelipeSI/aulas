package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Questao1 {

    public static void main (String [] args) throws IOException {

        Scanner leitura = new Scanner (System.in);

        int numero = 17;

        while (true) {

            if (numero%11 > 0 || numero%13 >0 || numero%17 > 0) {
                numero++;
            } else {
                break;
            }
        }

        System.out.println(numero);
    }
}


