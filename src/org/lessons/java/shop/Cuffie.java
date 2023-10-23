package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    private String colore;
    private String tipo;
    public Cuffie(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String colore, String tipo) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Colore: " + colore + ", " +
                "Tipo: " + tipo;
    }
}
