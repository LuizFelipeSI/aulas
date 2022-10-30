package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 10:");
        int num = leitura.nextInt();

        if (num == 0) {
            System.out.println("Zero");
        } else if (num == 1) {
            System.out.println("Um");
        } else if (num == 2) {
            System.out.println("Dois");
        } else if (num == 3) {
            System.out.println("Três");
        } else if (num == 4) {
            System.out.println("Quatro");
        } else if (num == 5) {
            System.out.println("Cinco");
        } else if (num == 6) {
            System.out.println("Seis");
        } else if (num == 7) {
            System.out.println("Sete");
        } else if (num == 8) {
            System.out.println("Oito");
        } else if (num == 9) {
            System.out.println("Nove");
        } else {
            System.out.println("Dez");
        }
    }
}
