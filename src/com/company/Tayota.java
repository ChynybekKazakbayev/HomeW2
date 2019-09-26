package com.company;

public class Tayota extends Car implements  Printable {
    private String color;

    public Tayota(String color) {
        setName("Tayouta");
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Name:"+getName()+"\n"+"Цвет:"+color);
    }
}
