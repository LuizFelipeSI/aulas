package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main25 {

    public static void main(String[] args) throws IOException {

        // Enigma

        Scanner leitura = new Scanner(System.in);

        String letras = leitura.next();
        String crib = leitura.next();

        int posicoesPossiveis = 0;

        if (letras.length() > 0 && letras.length() < 10001) {
            if (crib.length() > 0 && crib.length() <= letras.length()) {

                for(int j = 0; j < letras.length()-crib.length()+1; j++) {
                    for (int i = 0; i < crib.length(); i++) {
                        if (crib.charAt(i) != letras.charAt(i+j)) {

                            if (i == crib.length()-1) {
                                posicoesPossiveis++;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(posicoesPossiveis);
    }
}