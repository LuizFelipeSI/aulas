package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main12 {

    public static void main (String[] args) throws IOException {

        // Substituição em vetor 1

        Scanner leitura = new Scanner (System.in);

        int [] x = new int[10];
        for(int i =0;i<10;i++){
            x[i] = leitura.nextInt();
            if(x[i]<=0){
                x[i]=1;
            }

        }for(int j =0;j<10;j++) {
            System.out.println("X[" + j + "] = " + x[j]);

        }
    }
}
