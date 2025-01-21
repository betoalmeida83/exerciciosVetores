package abaixoDaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();
        double soma = 0.000;

        double[] vetor = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextDouble();
            soma += vetor[i];
        }

        double media = soma / n;
        System.out.print("\nMEDIA DO VETOR = " + media);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");

        for(int i = 0; i < n; i++) {
            if(vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }

        input.close();

    }
}
