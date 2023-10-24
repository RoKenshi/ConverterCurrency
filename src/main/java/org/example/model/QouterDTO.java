package org.example.model;

public class QouterDTO {
    private double usd;
    private double eur;

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    @Override
    public String toString() {
        return "QouterDTO{" +
                "usd=" + usd +
                ", eur=" + eur +
                '}';
    }
}
