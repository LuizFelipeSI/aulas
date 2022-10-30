package br.edu.univas;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite 10 números:");

        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 10; i++) {
            int n = leitura.nextInt();

            if (i == 0) {
                maior = n;
                menor = n;
            } else if (n > maior) {
                maior = n;
            } else if (n < menor) {
                menor = n;
            }
        }

        System.out.println("O maior número digitado: " + maior);
        System.out.println("O menor número digitado: " + menor);
    }
}

