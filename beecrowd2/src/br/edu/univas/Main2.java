package br.edu.univas;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException {

        // Figurinhas

        Scanner leitura = new Scanner(System.in);

        int n = leitura.nextInt();

        if (n >= 1 && n <= 3000) {
            for (int i = 0; i < n; i++) {

                int f1 = leitura.nextInt();
                int f2 = leitura.nextInt();
                int tamanho = 1;

                if (f1 >= 1 && f1 <= 1000 && f2 >= 1 && f2 <= 1000) {

                    for (int j = 1; j <= 1000; j++) {
                        if (f1 % j == 0 && f2 % j == 0) {
                            if (j > tamanho) {
                                tamanho = j;
                            }
                        }
                    }
                    System.out.println(tamanho);
                } else {
                    break;
                }
            }
        }
    }
}

/* método para calcular MDC:

if (n >= 1 && n <= 3000) {
            for (int i = 0; i < n; i++) {

                int f1 = leitura.nextInt();
                int f2 = leitura.nextInt();
                int tamanho;

                if (f1 >= 1 && f1 <= 1000 && f2 >= 1 && f2 <= 1000) {
                    while (f2 != 0) {
                        tamanho = f1 % f2;
                        f1 = f2;
                        f2 = tamanho;
                    }
                } else {
                    break;
                }
                System.out.println(f1);
            }
        }


//único código que funcionou no beecrowd:

 DecimalFormat formata = new DecimalFormat("0,000");
        int a, b, teste, mdc = 1, melhor, resto;
        teste = leitura.nextInt();
        for (int i = 0; i < teste; i++) {
            a = leitura.nextInt();
            b = leitura.nextInt();
            if (a > b) {
                do{
                    resto = a % b;
                    a = b;
                    b = resto;
                } while(resto != 0);
                mdc = a;
            } else {
                do {
                    resto = b % a;
                    b = a;
                    a = resto;
                } while (resto != 0);
                mdc = b;
            }
            System.out.println(mdc);
        }
*/