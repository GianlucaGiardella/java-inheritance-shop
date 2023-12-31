package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto{
    private int pollici;
    private boolean smartTV;
    public Televisore(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, int pollici, boolean smartTV) {
        super(nome, descrizione, prezzo, iva);
        this.pollici = pollici;
        this.smartTV = smartTV;
    }

    public int getPollici() {
        return pollici;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Pollici: " + pollici + ", " +
                "SmartTV: " + smartTV;
    }
}
