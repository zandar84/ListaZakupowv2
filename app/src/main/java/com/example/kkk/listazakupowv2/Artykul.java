package com.example.kkk.listazakupowv2;

public class Artykul {
    private String Nazwa_artykulu;
    private String Cena_artykulu;
    private int Obraz_artykulu;

    public Artykul() {
    }

    public Artykul(String nazwa_artykulu, String cena_artykulu, int obraz_artykulu) {
        this.Nazwa_artykulu = nazwa_artykulu;
        this.Cena_artykulu = cena_artykulu;
        this.Obraz_artykulu = obraz_artykulu;
    }

    // Getter

    public String getNazwa_artykulu() {
        return Nazwa_artykulu;
    }

    public String getCena_artykulu() {
        return Cena_artykulu;
    }

    public int getObraz_artykulu() {
        return Obraz_artykulu;
    }

    // Setter

    public void setNazwa_artykulu(String nazwa_artykulu) {
        this.Nazwa_artykulu = nazwa_artykulu;
    }

    public void setCena_artykulu(String cena_artykulu) {
        this.Cena_artykulu = cena_artykulu;
    }

    public void setObraz_artykulu(int obraz_artykulu) {
        this.Obraz_artykulu = obraz_artykulu;
    }
}
