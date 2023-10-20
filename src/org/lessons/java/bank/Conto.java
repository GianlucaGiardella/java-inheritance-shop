package org.lessons.java.bank;

public class Conto {
    private int codice;
    private String proprietario;
    private int saldo;

    public Conto(int codice, String proprietario) {
        this.codice = codice;
        this.proprietario = proprietario;
        this.saldo = 0;
    }

    // Setters

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    // Getters

    public int getCodice() {
        return codice;
    }

    public String getProprietario() {
        return proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    // Utilities

    public boolean versaDenaro(int denaro) {
        if (denaro > 0) {
            this.saldo += denaro;
            return true;
        } else {
            return false;
        }
    }

    public boolean prelevaDenaro(int denaro) {
        if (denaro < this.saldo && denaro > 0) {
            this.saldo -= denaro;
            return true;
        } else {
            this.saldo = 0;
            return false;
        }
    }

    public String saldoFormattato() {
        return this.saldo + ",00 €";
    }

    public String codiceFormattato() {
        return "IT27" + codice;
    }
}
