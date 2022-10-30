package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) throws IOException {

        //média 3

        Scanner leitura = new Scanner (System.in);

        float n1 = leitura.nextFloat();
        float n2 = leitura.nextFloat() ;
        float n3 = leitura.nextFloat() ;
        float n4 = leitura.nextFloat();
        float media = (float) ((n1 * 2.0 + n2 * 3.0 + n3 * 4.0 + n4 * 1.0) / 10);

        System.out.println("Media: "+String.format("%.1f",media));

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if
        (media >= 5.0 && media <= 6.9){
            System.out.println("Aluno em exame.");

            float exame = leitura.nextFloat();
            System.out.println("Nota do exame: "+String.format("%.1f",exame));
            float mediafinal = (media + exame)/2;

            if (mediafinal >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: "+String.format("%.1f",mediafinal));
            } else{
                System.out.println("Aluno reprovado.");
            }

        } else{
            System.out.println("Aluno reprovado.");
        }
    }
}