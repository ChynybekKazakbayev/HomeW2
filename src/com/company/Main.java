package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Bmw").print();
        createObject("Mersedes").print();
        createObject("Toyota").print();
    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "Bmw":
                printable = new Bmw(3.0);
                break;
            case "Mersedes":
                printable = new Mersedes(2003);
                break;
            case "Toyota":
                printable = new Tayota("Red");
                break;
        }return printable;
    }
}
