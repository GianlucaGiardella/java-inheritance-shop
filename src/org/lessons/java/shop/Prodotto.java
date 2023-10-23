package org.lessons.java.shop;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private int prezzo;
    private int iva;

    public Prodotto(String nome, String descrizione, int prezzo, int iva) {
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

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(int iva) {
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

    public int getPrezzo() {
        return prezzo;
    }

    public int getIva() {
        return iva;
    }

    // Utilities

    private int generaCodice() {
        Random rand = new Random();
        return rand.nextInt(1000, 1000000);
    }

    public String getPrezzoConIva() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(prezzo * (1 + ((double) iva / 100)));
    }

    public String getNomeEsteso() {
        return (codice + " " + nome).replaceAll(" ", "-");
    }

    public String getCodiceCompleto() {
        String srtingaCodice = Integer.toString(codice);
        int lunghezzaCodice = srtingaCodice.length();
        return lunghezzaCodice < 8 ? "0".repeat(8 - lunghezzaCodice) + srtingaCodice : srtingaCodice;
    }
}
