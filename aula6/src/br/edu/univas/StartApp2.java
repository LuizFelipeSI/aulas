package br.edu.univas;

import java.util.Scanner;

public class StartApp2 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int a = leitura.nextInt();
        System.out.println("Digite o segundo número:");
        int b = leitura.nextInt();
        System.out.println("Digite o terceiro número:");
        int c = leitura.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("a é o maior número");
            } else {
                System.out.println("c é o maior número");
            }
        } else if (b > a) {
            if (b > c) {
                System.out.println("b é o maior numero");
            } else {
                System.out.println("c é o maior numero");
            }
        } else if (c > a) {
            if (c > b) {
                System.out.println("c é o maior numero");
            } else {
                System.out.println("b é o maior numero");
            }
        }
    }
}
