package br.edu.univas;

public class Exercicio2 {

    public static void main(String[] args) {

        System.out.println("numeros de 1 a 100 pares, divisiveis por 3");

        for (int i = 1; i < 101; i++) {

            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    System.out.println("Par divi´sivel por 3: " + i);
                }
                if (i % 4 == 0) {
                    System.out.println("Par divi´sivel por 4: " + i);
                }
            } else {
                if (i % 3 == 0) {
                    System.out.println("Ímpar divi´sivel por 3: " + i);
                }
                if (i % 4 == 0) {
                    System.out.println("Ímpar divi´sivel por 4: " + i);
                }
            }
        }
    }
}