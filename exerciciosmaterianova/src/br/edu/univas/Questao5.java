package br.edu.univas;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");
        String frase = leitura.nextLine();
        System.out.println(trocaDeFrase(frase));

    }

    public static String trocaDeFrase(String frase) {

        frase = frase.replaceAll(" ","");

        return frase;

    }
}

/*
int j = 0;
        char[] array = new char[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                array[j] = frase.charAt(i);
                j++;
            }
        }

        return array;
*/