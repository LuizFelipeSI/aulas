package br.edu.univas;

public class Exercicio4 {

    public static void main (String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
           for (int j = n; j >= 1; j--) {
               System.out.print("\t");
               if (j <= i) {
                   System.out.print(j);
               }
           }
           for (int j = 2; j <= n; j++) {
               System.out.print("\t");
               if (j <= i ) {
                   System.out.print(j);
               }
           }
            System.out.println("");
        }
    }
}

