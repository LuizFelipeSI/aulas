package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        int idade[] = new int[1000];
        int criança = 0;
        int adolescente = 0;
        int adulto = 0;
        int idoso = 0;
        int soma = 0;

        for (int i = 0; i < 999; i++) {
            System.out.println("Digite sua idade:");
            idade[i] = leitura.nextInt();

            if (idade[i] >= 0 && idade[i] < 13) {
                criança++;
                soma++;
            } else if (idade[i] >= 13 && idade[i] < 18) {
                adolescente++;
                soma++;
            } else if (idade[i] >= 18 && idade[i] <= 60) {
                adulto++;
                soma++;
            } else if (idade[i] > 60) {
                idoso++;
                soma++;
            }

            if (idade[i] == -1) {
                break;
            }
        }

        System.out.println(criança + " - " + (criança * 100) / soma + "%");
        System.out.println(adolescente + " - " + (adolescente * 100) / soma + "%");
        System.out.println(adulto + " - " + (adulto * 100) / soma + "%");
        System.out.println(idoso + " - " + (idoso * 100) / soma + "%");

        //OU

        int idadeAtual = 0;
        int contador = 0;

        do {
            System.out.println("Por favor, digite sua idade");
            idadeAtual = leitura.nextInt();
            if (idadeAtual != -1) {
                idade[contador++] = idadeAtual;
            }
        } while (idadeAtual != -1);

        int contadorCriança = 0;
        int contadorAdolescente = 0;
        int contadorAdulto = 0;
        int contadorIdoso = 0;

        for (int r = 1; r < contador; r++) {
            if (idade[r] <= 12) {
                contadorCriança++;
            } else if (idade[r] <= 17) {
                contadorAdolescente++;
            } else if (idade[r] <= 60) {
                contadorAdulto++;
            } else {
                contadorIdoso++;
            }
        }

        int porcentagemCriança = contadorCriança*100/contador;
        int porcentagemAdolescente = contadorAdolescente*100/contador;
        int porcentagemAdulto = contadorAdulto*100/contador;
        int porcentagemIdoso = contadorIdoso*100/contador;

        System.out.println(contadorCriança + " " + porcentagemCriança);
        System.out.println(contadorAdolescente + " " +porcentagemAdolescente);
        System.out.println(contadorAdulto + " " + porcentagemAdulto);
        System.out.println(contadorIdoso + " " + porcentagemIdoso);
    }
}