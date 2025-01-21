package alturas;
import alturas.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = input.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for(int i = 0; i < n; i++) {
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Altura: ");
            double altura = input.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double soma = 0.0;
        for(int i = 0; i < n; i++) {
            soma += pessoas[i].getAltura();
        }
        double mediaAltura = soma / n;

        int soma16 = 0;
        for(int i = 0; i < n; i++) {
            if(pessoas[i].getIdade() < 16) {
                soma16++;
            }
        }
        double porcentagem = (double) soma16/n * 100;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
        for(int i = 0; i < n; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

        input.close();
    }
}
