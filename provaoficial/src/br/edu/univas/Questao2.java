package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Questao2 {

    public static void main (String [] args) throws IOException {

        Scanner leitura = new Scanner (System.in);

        int totalJogos = 20;
        int jogos[] = new int [totalJogos];
        int derrota = 0;
        int vitoria = 0;
        int empate = 0;

        for (int i = 0; i < totalJogos; i++) {
            System.out.println("digite -1 para derrota, 0 para empate ou 1 para vitória:");
            jogos [i] = leitura.nextInt();

            if (jogos[i] == 0) {
                empate++;
            } else if (jogos[i] == -1) {
                derrota++;
            } else {
                vitoria++;
            }
        }

        System.out.println("derrotas: " + derrota);
        System.out.println("vitórias: " + vitoria);
        System.out.println("empates: " + empate);
    }
}
