package com.Rasyid.modul4.projek;

public class Komponen {
    private String pemain;
    private int seranganMusuh;
    private int seranganPemain;
    private int darahMusuh;
    private int darahPemain;
    private String musuh;

    public String getPemain() {
        return pemain;
    }

    public int getSerangan() {
        return seranganPemain;
    }

    public int getSeranganPemain() {
        this.darahMusuh = darahMusuh - seranganPemain;
        return darahMusuh;
    }

    public int getSeranganMusuh() {
        int result = 0;
        result = darahPemain - seranganMusuh;
        return result;
    }

    public int getDarahMusuh() {
        return darahMusuh;
    }

    public int getDarahPemain() {
        return darahPemain;
    }

    public String musuh() {
        return musuh;
    }

    public void setPemain(String pemain) {
        this.pemain = pemain;
    }

    public void setMusuh(String musuh, int darah) {
        this.musuh = musuh;
        this.darahMusuh = darah;
    }

    public void setDarah(int darahPemain, int darahMusuh) {
        this.darahPemain = darahPemain;
        this.darahMusuh = darahMusuh;
    }

    public void setSerangan(int seranganPemain, int seranganMusuh) {
        this.seranganPemain = seranganPemain;
        this.seranganMusuh = seranganMusuh;
    }

}
