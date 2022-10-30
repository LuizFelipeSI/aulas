package br.edu.univas;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite dois números:");
        int primeiro = leitura.nextInt();
        int segundo = leitura.nextInt();
        int maior = comparacao(primeiro, segundo);
        System.out.println("O maior número digitado foi: " + maior);

    }

    public static int comparacao(int primeiro, int segundo) {

        int maior;
        if (primeiro > segundo) {
            maior = primeiro;
        } else if (segundo > primeiro) {
            maior = segundo;
        } else {
            maior = primeiro;
        }
        return(maior);
    }
}