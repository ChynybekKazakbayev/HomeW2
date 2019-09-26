package com.company;

public class Mersedes extends Car implements Printable {
    private int year;

    public Mersedes(int year) {
        setName("Mersedec");
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("Name:"+getName()+"\n"+"Год выпуска:"+year);

    }
}
