package ru.job4j.cast;

public class Bus implements Vehicle {

    String nameClass = getClass().getSimpleName();

    @Override
    public void move() {
        System.out.println(nameClass + " двигается по скоростным трассам");
    }
}
