package somaVetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = input.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorSoma = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < n; i++) {
            vetorA[i] = input.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < n; i++) {
            vetorB[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < n; i++){
            System.out.println(vetorSoma[i]);
        }

        input.close();

    }
}
