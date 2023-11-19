package application;

import entities.Hospede;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

       Hospede[] hospedes = new Hospede[10];

        System.out.print("Quantos quartos vão ser alugados? ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){
            sc.nextLine();
            System.out.println("RENT #" + i + ":");

            System.out.println("NOME: ");
            String nome = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("QUARTO: ");
            int quarto = sc.nextInt();

            hospedes[quarto] = new Hospede(nome, email);
        }

        System.out.println();
        System.out.println("Quartos Ocupados: ");
        for (int i = 0; i <= 9; i++){
            if (hospedes[i] != null){
                System.out.println(i + ": " + hospedes[i]);
            }
        }

        System.out.println();
        System.out.println("Quartos Livres: ");
        for (int i = 0; i <= 9; i++) {
            if(hospedes[i] == null) {
                System.out.println(": " + i);
            }
        }

        sc.close();

        System.out.println("Fim e teste Commit");
    }
}