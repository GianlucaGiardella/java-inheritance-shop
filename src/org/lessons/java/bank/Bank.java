package org.lessons.java.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire il nome: ");
        String inputNome = scan.nextLine();

        Random random = new Random();
        int codice = random.nextInt(1, 1001);

        Conto conto = new Conto(codice, inputNome);

        System.out.print("\nConto creato con successo!\n" +
                "\nScegli una delle seguenti operazioni:\n" +
                "- Tasto 1 | Versa denaro\n" +
                "- Tasto 2 | Preleva denaro\n" +
                "- Tasto 3 | Esci\n" +
                "- Premi: ");

        int inputOperazioni = scan.nextInt();

        switch (inputOperazioni) {
            case 1:
                System.out.print("\nInserire la quantita di denaro da versare: ");
                int inputVersa = scan.nextInt();
                if (conto.versaDenaro(inputVersa)) {
                    System.out.println("\nOperazione eseguita con successo!");
                    System.out.println("\nConto: " + conto.codiceFormattato() +
                            "\nSaldo attuale: " + conto.saldoFormattato());
                } else {
                    System.out.println("\nOperazione non valida!");
                }
                break;
            case 2:
                System.out.print("\nInserire la quantita di denaro da prelevare: ");
                int inputPreleva = scan.nextInt();
                if (conto.prelevaDenaro(inputPreleva)) {
                    System.out.println("\nOperazione eseguita con successo!");
                    System.out.println("\nConto: " + conto.codiceFormattato() +
                            "\nSaldo attuale: " + conto.saldoFormattato());
                } else {
                    System.out.println("\nOperazione non valida!");
                }
                break;
            case 3:
                System.out.println("\nArrivederci!");
                break;
        }

        scan.close();
    }
}
