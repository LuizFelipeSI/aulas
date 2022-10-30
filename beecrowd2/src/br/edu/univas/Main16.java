package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main16 {

    public static void main(String[] args) throws IOException {

        // Um-dois-três

        Scanner leitura = new Scanner(System.in);

        int n = leitura.nextInt();
        if (n <= 1000) {
            for (int i = 0; i < n; i++) {
                String numero = leitura.next();
                if (numero.length() == 3) {
                    if (numero.charAt(0) == 'o' && numero.charAt(1) == 'n') {
                        System.out.println(1);
                    } else if (numero.charAt(0) == 'o' && numero.charAt(2) == 'e') {
                        System.out.println(1);
                    } else if (numero.charAt(1) == 'n' && numero.charAt(2) == 'e') {
                        System.out.println(1);
                    } else if (numero.charAt(0) == 'o' && numero.charAt(1) == 'n' && numero.charAt(2) == 'e') {
                        System.out.println(1);
                    } else if (numero.charAt(0) == 't' && numero.charAt(1) == 'w') {
                        System.out.println(2);
                    } else if (numero.charAt(0) == 't' && numero.charAt(2) == 'o') {
                        System.out.println(2);
                    } else if (numero.charAt(1) == 'w' && numero.charAt(2) == 'o') {
                        System.out.println(2);
                    } else if (numero.charAt(0) == 't' && numero.charAt(1) == 'w' && numero.charAt(2) == 'o') {
                        System.out.println(2);
                    }
                } else if (numero.length() == 5) {
                    if (numero.charAt(0) == 't' && numero.charAt(1) == 'h' && numero.charAt(2) == 'r' && numero.charAt(3) == 'e') {
                        System.out.println(3);
                    } else if (numero.charAt(0) == 't' && numero.charAt(1) == 'h' && numero.charAt(2) == 'r' && numero.charAt(4) == 'e') {
                        System.out.println(3);
                    } else if (numero.charAt(0) == 't' && numero.charAt(1) == 'h' && numero.charAt(3) == 'e' && numero.charAt(4) == 'e') {
                        System.out.println(3);
                    } else if (numero.charAt(0) == 't' && numero.charAt(2) == 'r' && numero.charAt(3) == 'e' && numero.charAt(4) == 'e') {
                        System.out.println(3);
                    } else if (numero.charAt(1) == 'h' && numero.charAt(2) == 'r' && numero.charAt(3) == 'e' && numero.charAt(4) == 'e') {
                        System.out.println(3);
                    } else if (numero.charAt(0) == 't' && numero.charAt(1) == 'h' && numero.charAt(2) == 'r' && numero.charAt(3) == 'e' && numero.charAt(4) == 'e') {
                        System.out.println(3);
                    }
                }
            }
        } else {

        }
    }
}