package br.edu.univas;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a média da temperatura de cada mês do ano:");
        int[] medias = new int[12];

        for (int i = 0; i < 12; i++) {
            medias[i] = leitura.nextInt();
        }

        int calculoMediaGeral = mediaGeral(medias);
        int[] array = novoArray(medias, calculoMediaGeral);
        System.out.println("Média: " + calculoMediaGeral);
        System.out.println("Situação de cada mês (-1) abaixo da média (0) igual a média (1) acima da média: ");
        for (int i = 0; i < 12; i++){
            System.out.println(array[i]);
        }
    }

    public static int mediaGeral(int[] medias) {

        int mGeral = 0;
        for (int i = 0; i < 12; i++){
            mGeral += medias[i];
        }
        mGeral = mGeral/12;

        return mGeral;
    }

    public static int[] novoArray(int[] medias, int calculoMediaGeral) {

        for (int i = 0; i < 12; i++) {
            if (medias[i] < calculoMediaGeral) {
                medias[i] = -1;
            } else if (medias[i] > calculoMediaGeral) {
                medias[i] = 1;
            } else {
                medias[i] = 0;
            }
        }

        return medias;
    }
}