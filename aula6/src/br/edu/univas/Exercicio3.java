package br.edu.univas;

public class Exercicio3 {

    public static void main (String[] args) {

        int min = 6;
        int max = 10;

        for (int i = min; i < max; i++) {
         System.out.print("\t" + i);

        }
        for (int i = min; i <= max; i++) {
            System.out.print("\n" + i);
            for (int j = 6; j < 10; j++) {
                int aux = i * j;
                System.out.print("\t" + aux);
            }
        }
    }
}
