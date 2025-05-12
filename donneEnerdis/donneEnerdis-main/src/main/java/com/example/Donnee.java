package com.example;

public class Donnee {
    private int id;
    private String date;
    private int valeur;
    private String unite;

    public Donnee(int id, String date, int valeur, String unite) {
        this.id = id;
        this.date = date;
        this.valeur = valeur;
        this.unite = unite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }
}
