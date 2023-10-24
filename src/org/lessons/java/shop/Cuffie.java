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

    public String getColore() {
        return colore;
    }

    public String getTipo() {
        return tipo;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Colore: " + colore + ", " +
                "Tipo: " + tipo;
    }
}
