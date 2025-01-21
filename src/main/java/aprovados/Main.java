package aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = input.nextInt();

        String[] vetorNome = new String[n];
        double[] vetorNota1 = new double[n];
        double[] vetorNota2 = new double[n];
        double[] vetorMedia = new double[n];


        for(int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + i+1 + "o aluno:");
            input.nextLine();
            vetorNome[i] = input.nextLine();
            vetorNota1[i] = input.nextDouble();
            vetorNota2[i] = input.nextDouble();
        }

        for(int i = 0; i < n; i++) {
            vetorMedia[i] = (vetorNota1[i] + vetorNota2[i]) / 2.0;
        }

        System.out.println("Alunos aprovados:");
        for(int i = 0; i < n; i++) {
            if(vetorMedia[i] >= 6.0) {
                System.out.println(vetorNome[i]);
            }
        }

        input.close();

    }
}
