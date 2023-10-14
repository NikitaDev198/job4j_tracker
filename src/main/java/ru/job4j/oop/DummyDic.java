package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic whatever = new DummyDic();
        String rsl = whatever.engToRus("Congratulations");
        System.out.println(rsl);
    }

}

