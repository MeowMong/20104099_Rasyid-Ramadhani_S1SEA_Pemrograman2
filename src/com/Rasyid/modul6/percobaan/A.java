package com.Rasyid.modul6.percobaan;

public class A {
    // Super Class
    // Atribut X dan Y dengan modifier private
    protected int x;
    protected int y;

    // Setter X dan Y
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai() {
        System.out.println("nilai x\t: " + x + " nilai y\t: " + y);
    }
}
