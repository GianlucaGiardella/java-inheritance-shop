package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto[] prodotti = {
                new Prodotto("iPhone Pro", "Il miglior iPhone di sempre!", 1239, 22),
                new Prodotto("iPad Pro", "Il miglior iPad di sempre!", 1079, 22),
                new Prodotto("MacBook Pro", "Il miglior MacBook di sempre!", 1649, 22)
        };

        for (Prodotto prodotto : prodotti) {
            System.out.println("Nome completo: " + prodotto.getNomeEsteso());
            System.out.println("Prezzo comprensivo di iva: " + prodotto.getPrezzoConIva());
            System.out.println("Codice formattato: " + prodotto.getCodiceCompleto());
            System.out.println();
        }
    }
}
