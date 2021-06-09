package com.codegym;

public class Main {

    public static void main(String[] args) {
        StaticProperty s1 = new StaticProperty("mazda 3", "skyactiv 3");
        System.out.println(StaticProperty.numberOfCars);
        StaticProperty s2 = new StaticProperty("mada 6", "skyacty 6");
        System.out.println(StaticProperty.numberOfCars);
    }
}
