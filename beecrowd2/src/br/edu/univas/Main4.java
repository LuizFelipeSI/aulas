package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main4 {

    public static void main (String[] args) throws IOException {

        // Múltiplos

        Scanner leitura = new Scanner (System.in);

        int a = leitura.nextInt();
        int b = leitura.nextInt();

        if (a > b) {
            if (a%b == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else if (b > a) {
            if (b%a == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }

        // não é obrigatório, mas é uma boa prática, o .close() fecha a variável que estiver usando o Scanner para não ser usada mais

        leitura.close();

    }
}
