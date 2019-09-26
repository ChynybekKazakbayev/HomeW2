package com.company;

public class Bmw extends Car implements Printable {
    private double volume;

    public Bmw(double volume) {
        setName("Bmw");
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("Name:"+getName()+"\n"+"Объём:"+volume);

    }
}
