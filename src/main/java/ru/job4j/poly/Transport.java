package ru.job4j.poly;

public interface Transport {

    void drive();

    void passengers(int passengers);

    default int refill(int amountOfFuel) {
        return amountOfFuel * 55;
    }

}
