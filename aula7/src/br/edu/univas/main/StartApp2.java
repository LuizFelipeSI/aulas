package br.edu.univas.main;

import java.util.Scanner;

public class StartApp2 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int[] idade = new int[5];

        System.out.println(idade.length);

        idade[2] = 8;

        //a quantidade de itens dentro determina o tamanho do array:

        int[] idade2 = {1, 5, 10};
        System.out.println(idade2.length);

        // preencher um array de tamanho aleatório de forma ordenada:

        int n = leitura.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
            System.out.println(numeros[i]);

        }
    }
}

/*  preencher array com números aleatórios:

    Random random = new Random();

    int array[] = new int[5]; // 5 números serão gerados.

        for (int i=0; i<array.length; i++) {
        array[i] = random.nextInt(50); // Gera números aleatórios com limite 50.
        System.out.println(array[i]); // Saída, são gerados 5 números.
        }
*/

