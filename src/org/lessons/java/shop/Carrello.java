package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanti dispositivi vuoi comprare ?");
        int totaleDispositivi = Integer.parseInt(scan.nextLine());

        Prodotto[] prodotti = new Prodotto[totaleDispositivi];

        for (int i = 0; i < totaleDispositivi; i++) {

            System.out.println("\n Digita il numero del dispositivo che vuoi aggiungere: " +
                    "\n- N.1 | Smartphone" +
                    "\n- N.2 | Televisore" +
                    "\n- N.3 | Cuffie" +
                    "\nDigita il numero qui: ");

            int dispositivoSelezionato = Integer.parseInt(scan.nextLine());

            System.out.println("Inserire il nome del dispositivo: ");
            String nome = scan.nextLine();

            System.out.println("Inserire una descrizione: ");
            String descrizione = scan.nextLine();

            System.out.println("Inserire il prezzo base: ");
            String prezzo = scan.nextLine();

            System.out.println("Inserire l'iva: ");
            String iva = scan.nextLine();

            switch (dispositivoSelezionato) {
                case 1:
                    System.out.println("Inserire il codice IMEI: ");
                    long codeIMEI = Long.parseLong(scan.nextLine());

                    System.out.println("Inserire la quantità di memoria: ");
                    int memoria = Integer.parseInt(scan.nextLine());

                    Smartphone smartphone = new Smartphone(
                            nome,
                            descrizione,
                            new BigDecimal(prezzo),
                            new BigDecimal(iva),
                            codeIMEI,
                            memoria
                    );

                    prodotti[i] = smartphone;
                    break;
                case 2:
                    System.out.println("Inserire il numero dei pollici: ");
                    int pollici = Integer.parseInt(scan.nextLine());

                    System.out.println("Inserire se la TV è smart oppure no: ");
                    boolean smartTV = Boolean.parseBoolean(scan.nextLine());

                    Televisore televisore = new Televisore(
                            nome,
                            descrizione,
                            new BigDecimal(prezzo),
                            new BigDecimal(iva),
                            pollici,
                            smartTV
                    );

                    prodotti[i] = televisore;
                    break;
                case 3:
                    System.out.println("Inserire il colore delle cuffie: ");
                    String colore = scan.nextLine();

                    System.out.println("Inserire il tipo di cuffie: " +
                            "\n- Cablate" +
                            "\n- Wirless");
                    String tipo = scan.nextLine();

                    Cuffie cuffie = new Cuffie(
                            nome,
                            descrizione,
                            new BigDecimal(prezzo),
                            new BigDecimal(iva),
                            colore,
                            tipo
                    );

                    prodotti[i] = cuffie;
                    break;
            }

            System.out.println("Prodotto aggiunto al carrello!");
        }

        BigDecimal totale = new BigDecimal(0);

        System.out.println("\nLista dei prodotti: ");

        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto.toString());
            totale = totale.add(prodotto.getPrezzoConIva());
        }

        System.out.println("\nTotale: " + totale + "€");

        scan.close();
    }
}
