package ru.job4j.cast;

public class Airplane implements Vehicle {

    private String nameClass = getClass().getSimpleName();

    @Override
    public void move() {
        System.out.println(nameClass + " летает по воздуху");
    }
}
