package dadosPessoas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = input.nextInt();
        double auxMaior = 0.00;
        double auxMenor = 0.00;
        int contF = 0;
        double somaF = 0;
        int contM = 0;
        double[] vetorAltura = new double[n];
        char[] vetorSexo = new char[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            vetorAltura[i] = input.nextDouble();
            input.nextLine();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            vetorSexo[i] = input.next().charAt(0);

            if(vetorSexo[i] == 'F' || vetorSexo[i] == 'f') {
                somaF += vetorAltura[i];
                contF++;
            }

            if(vetorSexo[i] == 'M' || vetorSexo[i] == 'm') {
                contM++;
            }
        }

        for(int i = 0; i < n; i++) {
            if(vetorAltura[i] > auxMaior) {
                auxMaior = vetorAltura[i];
            }
        }

        auxMenor = auxMaior;

        for(int i = 0; i < n; i++) {
            if(vetorAltura[i] < auxMenor) {
                auxMenor = vetorAltura[i];
            }
        }

        System.out.println("Menor altura = " + auxMenor);
        System.out.println("Maior altura = " + auxMaior);
        System.out.printf("Media das alturas das mulheres = %.2f%n", (somaF/contF));
        System.out.println("Numero de homens = " + contM);

        input.close();

    }
}
