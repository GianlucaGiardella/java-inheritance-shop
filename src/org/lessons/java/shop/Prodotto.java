package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private int prezzo;
    private int iva;

    public Prodotto(String nome, String descrizione, int prezzo, int iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(1000, 1000000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Setters
    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(byte iva) {
        this.iva = iva;
    }

    // Getters
    public String getName() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getIva() {
        return iva;
    }

    public double getPrezzoConIva() {
        return prezzo += (iva + 100) / 100;
    }

    public String getNomeEsteso() {
        return codice + "-" + nome;
    }

    public String getCodiceCompleto() {
        String srtingaCodice = Integer.toString(codice);
        int lunghezzaCodice = srtingaCodice.length();
        return lunghezzaCodice < 8 ? "0".repeat(8 - lunghezzaCodice) + srtingaCodice : srtingaCodice;
    }
}
