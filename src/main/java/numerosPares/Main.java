package numerosPares;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = input.nextInt();
        int qtdPares = 0;

        int[] vetor = new int[n];

        for(int i = 0; i < n; i++) {
            vetor[i] = input.nextInt();
            if(vetor[i] % 2 == 0) {
                qtdPares++;
            }
        }
        System.out.println("NUMEROS PARES:");
        for(int i = 0; i < n; i++) {
            if(vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
        System.out.println("\nQUANTIDADES DE PARES = " + qtdPares);

        input.close();

    }
}
