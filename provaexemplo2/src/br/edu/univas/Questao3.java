package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        int[] numeros = new int[25];
        int contadorNumerosNegativos = 0;

        for (int i = 0; i < 25; i++) {
            System.out.println("Digite um número:");
            int numero = leitura.nextInt();
            if (numero >= 0) {
                numeros[i] = numero;
            } else {
                numeros[i] = 100;
                contadorNumerosNegativos++;
            }
        }

        int porcentagem = contadorNumerosNegativos * 100 / 25;
        System.out.println("Quantidade números negativos: " + contadorNumerosNegativos);
        System.out.println("Porcentagem números negativos: " + porcentagem  + "%");
    }
}