package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        this.codice = generaCodice();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    // Getters

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    // Utilities

    private int generaCodice() {
        Random rand = new Random();
        return rand.nextInt(1000, 1000000);
    }

    public BigDecimal getPrezzoConIva() {
        return prezzo.add(prezzo.multiply(iva.divide(new BigDecimal("100")))).setScale(2, RoundingMode.HALF_EVEN);
    }

    public String getNomeEsteso() {
        return (codice + " " + nome).replaceAll(" ", "-");
    }

    public String getCodiceCompleto() {
        String srtingaCodice = Integer.toString(codice);
        int lunghezzaCodice = srtingaCodice.length();
        return lunghezzaCodice < 8 ? "0".repeat(8 - lunghezzaCodice) + srtingaCodice : srtingaCodice;
    }

    @Override
    public String toString() {
        return "- Nome: " + nome + ", " +
                "Descrizione: " + descrizione + ", " +
                "Prezzo base: " + prezzo + "€, " +
                "Iva prodotto: " + iva + "%, " +
                "Prezzo con IVA: " + getPrezzoConIva() + "€, ";
    }
}
