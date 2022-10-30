package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int somaTotal = 0;
        int maximo = 20;
        int[] notas = new int[maximo];

        //a ultima posição é sempre o tamanho do array -1

       // notas[5] = 12;
       // notas[0] = 99;
       // notas[19] = 19;

        for (int i = 0; i < maximo; i++) {
            System.out.println("Por favor digite a nota:");

            notas[i] = leitura.nextInt();
            somaTotal += notas[i];
        }
        int media = somaTotal / maximo;
        System.out.println("media: " + media);
        System.out.println("a nota de cada aluno foi:");
        for (int i = 0; i < maximo; i++) {
            System.out.println(notas[i]);
        }
    }
}
