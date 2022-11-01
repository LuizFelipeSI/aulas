package br.edu.univas;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Escreva uma palavra qualquer e ela irá retornar ao contrário:");
        String nome = leitura.next();
        char[] array = inversao(nome);
        System.out.println(array);
        System.out.println(inversao2(nome));
    }

    public static char[] inversao (String nome) {

        int j = nome.length() - 1;
        char[] array = new char[nome.length()];
        for (int i = 0; i < nome.length(); i++) {
            char aux = nome.charAt(i);
            array[j] = aux;
            j--;
        }

        return array;
    }

    // OU

    public static String inversao2 (String nome) {

        String newWord = "";
        for (int i = nome.length() - 1; i >= 0; i--) {
         newWord += nome.charAt(i);
        }
        return newWord;
    }
}