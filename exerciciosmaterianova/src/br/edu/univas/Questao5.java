package br.edu.univas;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");
        String frase = leitura.next();
        char[] array = trocaDeFrase(frase);
        System.out.println(array);

    }

    public static char[] trocaDeFrase(String frase) {

        int j = 0;
        char[] array = new char[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                array[j] = frase.charAt(i);
                j++;
            }
        }

        return array;
    }
}