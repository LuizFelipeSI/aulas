package br.edu.univas;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int a = leitura.nextInt();
        System.out.println("digite outro numero: ");
        int b = leitura.nextInt();
        System.out.println("digite mais um numero: ");
        int c = leitura.nextInt();

        // "\n" é o comando para pular linha, ou seja, a próxima variável será imprimida na linha de baixo

        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println(a + "\n" + b + "\n" + c);
                } else {
                    System.out.println(a + "\n" + c + "\n" + b);
                }
            } else {
                System.out.println(c + "\n" + a + "\n" + b);
            }
        } else {
            if (b > c) {
                if (a > c) {
                     System.out.println(b + "\n" + a + "\n" + c);
                } else {
                    System.out.println(b + "\n" + c + "\n" + a);
                }
            } else {
                System.out.println(c + "\n" + b + "\n" + a);
            }
        }
    }
}
