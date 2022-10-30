package br.edu.univas;

        import java.io.IOException;
        import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) throws IOException {

        //fatorial

        Scanner leitura = new Scanner(System.in);

        int contador = 0;
        int numero = leitura.nextInt();

        while (numero > 0) {

            int somaFatorial = 1;
            int fatorial = 1;

            while (fatorial * (somaFatorial + 1) <= numero) {
                somaFatorial++;
                fatorial = fatorial * somaFatorial;
            }

            contador++;
            numero = numero - fatorial;
        }

        System.out.println(contador);
    }
}