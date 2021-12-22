package com.Rasyid.modul4.projek;

public class TrialKompos {
    // Declare Player
    private String pemain;
    private int seranganPemain;
    private int darahPemain;
    // Declare Enemy
    private String musuh;
    private int seranganMusuh;
    private int darahMusuh;

    // ENEMY and PLAYER
    public void setDefault(int darahPemain, int darahMusuh, int seranganPemain, int seranganMusuh) {
        this.darahPemain = darahPemain;
        this.darahMusuh = darahMusuh;
        this.seranganPemain = seranganPemain;
        this.seranganMusuh = seranganMusuh;
    }

    // Player Set Component
    public String getPlayerName() {
        return pemain;
    }

    public int getPlayerPower() {
        return seranganPemain;
    }

    public int getPlayerHP() {
        return darahPemain;
    }

    public int getAttackEnemy() {
        this.darahMusuh -= seranganPemain;
        return darahMusuh;
    }

    public int getPlayerUpDamage() {
        return seranganPemain;
    }

    public boolean getPlayerWin(int seranganPemain) {
        if (darahMusuh - seranganPemain <= 0)
            return true;
        else
            getAttackEnemy();
        return false;
    }

    public void setPlayerName(String pemain) {
        this.pemain = pemain;
    }

    public void setPlayerUpDamage(int seranganPemain) {
        this.seranganPemain += seranganPemain;
    }

    public void setPlayerUpHP(int darahPemain) {
        this.darahPemain += darahPemain;
    }

    // Enemy Set Component
    public String musuh() {
        return musuh;
    }

    public int getEnemyPower() {
        return seranganMusuh;
    }

    public int getEnemyHP() {
        return darahMusuh;
    }

    public int getAttackPlayer() {
        this.darahPemain -= seranganMusuh;
        return darahPemain;
    }

    public boolean getEnemyWin(int seranganMusuh) {
        if (darahPemain - seranganMusuh <= 0)
            return true;
        else
            getAttackPlayer();
        return false;
    }

}
