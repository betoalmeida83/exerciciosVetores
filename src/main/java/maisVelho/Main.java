package maisVelho;

//import maisVelho.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = input.nextInt();

        Pessoa[] pessoas = new Pessoa[n];
        Pessoa pessoaMaisVelha = null;


        for(int i = 0; i < n; i++) {
            input.nextLine();
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            pessoas[i] = new Pessoa(nome, idade);

            if(pessoaMaisVelha == null || pessoas[i].getIdade() > pessoaMaisVelha.getIdade()) {
                pessoaMaisVelha = pessoas[i];
            }
        }

        if(pessoaMaisVelha != null) {
            System.out.print("PESSOA MAIS VELHA: " + pessoaMaisVelha.getNome());
            System.out.print("\nIDADE: " + pessoaMaisVelha.getIdade());
        }

        input.close();

    }

}
