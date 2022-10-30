package br.edu.univas;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int[] funcionarios = new int[50];

        double estagiario = 0;
        double junior = 0;
        double pleno = 0;
        double senior = 0;

        for(int i = 0; i < 50; i++) {
            System.out.println("Digite 1 para estagiário, 2 para júnior, 3 para pleno e 4 para sênior:");
            funcionarios[i] = leitura.nextInt();

            if (funcionarios[i] == 1) {
                estagiario++;
            } else if (funcionarios[i] == 2) {
                junior++;
            } else if ( funcionarios[i] == 3) {
                pleno++;
            } else {
                senior++;
            }
        }

        System.out.println("Estagiários: " + estagiario + " - " + (estagiario*100)/50 + "%");
        System.out.println("Júnior: " + junior + " - " + (junior*100)/50 + "%");
        System.out.println("Pleno: " + pleno + " - " + (pleno*100)/50 + "%");
        System.out.println("Sênior: " + senior + " - " + (senior*100)/50 + "%");
    }
}
