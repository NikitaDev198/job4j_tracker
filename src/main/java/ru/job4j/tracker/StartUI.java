package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {

        Item firstItem = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(firstItem.getCreated().format(formatter));

        Item item = new Item("Great", 1);
        System.out.println(item);
    }

}
