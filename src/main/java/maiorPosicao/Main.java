package maiorPosicao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = input.nextInt();
        double aux = 0;
        int posicao = 0;

        double[] vetor = new double[n];

        for(int i = 0; i < n; i++) {
            vetor[i] = input.nextDouble();
            if(vetor[i] > aux) {
                aux = vetor[i];
                posicao = i;
            }
        }

        System.out.println("MAIOR VALOR = " + aux);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);

        input.close();

    }
}
