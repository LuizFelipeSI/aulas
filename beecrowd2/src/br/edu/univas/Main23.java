package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main23 {

    public static void main (String[] args) throws IOException {

        // Entrada e saída CPF

        Scanner leitura = new Scanner (System.in);

        String cpf = leitura.next();
        String x = cpf.substring( 0 , 3 );
        String y = cpf.substring( 4 , 7 );
        String z = cpf.substring( 8 , 11 );
        String d = cpf.substring( 12 , 14 );

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(d);

    }
}
