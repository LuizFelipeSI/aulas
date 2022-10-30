package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) throws IOException {

        //diferença

        Scanner Leitura = new Scanner(System.in);

        int A = Leitura.nextInt();
        int B = Leitura.nextInt();
        int C = Leitura.nextInt();
        int D = Leitura.nextInt();
        int diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);

    }
}