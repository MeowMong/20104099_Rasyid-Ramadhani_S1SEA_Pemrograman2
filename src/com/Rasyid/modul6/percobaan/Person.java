package com.Rasyid.modul6.percobaan;

public class Person {
    // Atribut
    protected String name;
    protected String address;

    // Overloading Constructor
    // Konstruktor tanpa parameter
    public Person() {
        System.out.println("Inside Person : Constructor");
        name = " ";
        address = " ";
    }

    // Konstruktor dengan 2 parameter
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // GETTER
    public String getName() {
        return name;
    }

    // SETTER
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}