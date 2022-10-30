package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        int numero = leitura.nextInt();
        int arredondado;
        int naoArredondado;

        if (numero % 5 == 0) {
            System.out.println(numero + " - " + numero + " (não arredondado)");
        } else if (numero % 5 == 1) {
            naoArredondado = numero;
            System.out.println(numero + " - " + naoArredondado + " (não arredondado)");
        } else if (numero % 5 == 2) {
            naoArredondado = numero;
            System.out.println(numero + " - " + naoArredondado + " (não arredondado)");
        } else if (numero % 5 == 3) {
            arredondado = numero + 2;
            System.out.println(numero + " - " + arredondado + " (arredondado)");
        } else {
            arredondado = numero + 1;
            System.out.println(numero + " - " + arredondado + " (arredondado)");
        }
    }
}