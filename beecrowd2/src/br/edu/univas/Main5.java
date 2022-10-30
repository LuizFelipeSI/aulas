package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main5 {

    public static void main (String[] args) throws IOException {

        // Tempo de jogo

        Scanner leitura = new Scanner (System.in);

        int inicio = leitura.nextInt();
        int fim = leitura.nextInt();
        int duracao;

        if (inicio > 23 || fim > 23) {
            System.out.println("HORÁRIO INVÁLIDO");
        } else if (fim > inicio) {
            duracao = fim-inicio;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else if (inicio == 0 && fim != 0) {
            duracao = inicio + fim;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else if (inicio != 0 && fim == 0) {
            duracao = 24-inicio;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else if (inicio == fim) {
            duracao = 24;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else if (inicio > fim) {
            duracao = (24-inicio)+fim;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
    }
}
