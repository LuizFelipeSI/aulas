package br.edu.univas;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Escreva uma palavra qualquer e ela irá retornar ao contrário:");
        String nome = leitura.next();
        char[] array = inversao(nome);
        System.out.println(array);
    }

    public static char[] inversao (String nome) {

        int tamanho = nome.length();
        int j = tamanho - 1;
        char[] array = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
            char aux = nome.charAt(i);
            array[j] = aux;
            j--;
        }

        return array;
    }
}