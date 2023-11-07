package ru.job4j.cast;

public class Train implements Vehicle {

    String nameClass = getClass().getSimpleName();

    @Override
    public void move() {
        System.out.println(nameClass + " передвигается по рельсам");
    }
}
