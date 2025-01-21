package mediaPares;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();
        int soma = 0;
        int cont = 0;
        int[] vetor = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextInt();
            if(vetor[i] % 2 == 0) {
                soma += vetor[i];
                cont++;
            }
        }

        double media = (double) soma / cont;

        if(cont != 0){
            System.out.print("MEDIA DOS PARES = " + media);
        }
        else {
            System.out.println("NENHUM NUMERO PAR");
        }

        input.close();

    }
}
