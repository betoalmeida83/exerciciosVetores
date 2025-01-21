package somaVetor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = input.nextInt();
        double soma = 0;
        double media = 0;
        double[] vetor = new double[n];

        for(int i = 0; i < n; i++) {
            vetor[i] = input.nextDouble();
            soma += vetor[i];
        }

        media = soma/n;

        System.out.print("VALORES = ");
        for(int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);

        input.close();

    }
}
