package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main19 {

    public static void main (String[] args) throws IOException {

        // Fuso horário

        Scanner leitura = new Scanner (System.in);

        int horaSaida = leitura.nextInt();
        int tempoViagem = leitura.nextInt();
        int fusoDestino = leitura.nextInt();

        if (horaSaida < 0 || horaSaida > 24) {
            System.out.println("horário inválido");
        } else if (horaSaida == 0) {
            horaSaida = 24;
        }
        if (tempoViagem < 1 | tempoViagem > 12) {
            System.out.println("horário inválido");
        }
        if (fusoDestino < -5 || fusoDestino > 5) {
            System.out.println("horário inválido");
        }

        int horaChegada = horaSaida+tempoViagem+fusoDestino;
        if (horaChegada > 23) {
            horaChegada = horaChegada - 24;
        }

        System.out.println(horaChegada);

    }
}
