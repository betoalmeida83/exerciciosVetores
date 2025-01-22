package pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int n = input.nextInt();

        Quarto[] quartos = new Quarto[10];

        for(int i = 0; i < n; i++) {
            input.nextLine();
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            String nome = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Room: ");
            int quarto = input.nextInt();
            quartos[quarto] = new Quarto(nome, email, quarto);
        }

        System.out.println("\nBusy Brown:");
        for (int i = 0; i < 10; i++) {
            if (quartos[i] != null) {
                System.out.println(quartos[i]);
            }
        }





        input.close();

    }
}
