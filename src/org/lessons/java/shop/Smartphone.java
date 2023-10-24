package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto{
    private long codiceIMEI;
    private int memoria;
    public Smartphone(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, long codiceIMEI, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }

    public long getCodiceIMEI() {
        return codiceIMEI;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setCodiceIMEI(long codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Codice IMEI: " + codiceIMEI + ", " +
                "Memoria: " + memoria;
    }
}
