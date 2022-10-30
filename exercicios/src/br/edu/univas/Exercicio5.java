package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 7:");
        int ds = leitura.nextInt();

        if (ds == 1) {
            System.out.println("Domingo");
        } else if (ds == 2) {
            System.out.println("Segunda");
        } else if (ds == 3) {
            System.out.println("Terça");
        } else if (ds == 4) {
            System.out.println("Quarta");
        } else if (ds == 5) {
            System.out.println("Quinta");
        } else if (ds == 6) {
            System.out.println("Sexta");
        } else
            System.out.println("Sábado");
    }
}