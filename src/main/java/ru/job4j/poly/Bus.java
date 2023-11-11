package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Транспорт двигается");
    }

    @Override
    public void passengers(int passengers) {
        int quntityOfPassangers = passengers;
    }
}
