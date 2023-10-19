package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {

        Book firstBook = new Book("Clean code", 287);
        Book secondBook = new Book("Clean Architecture", 350);
        Book thirdBook = new Book("Hedgehog in the fog", 55);
        Book fourthBook = new Book("(The Wizard of Oz", 115);

        Book[] books = new Book[4];
        books[0] = firstBook;
        books[1] = secondBook;
        books[2] = thirdBook;
        books[3] = fourthBook;

        for (int i = 0; i < books.length; i++) {
            System.out.println("Name of book is " + books[i].getName() + "; Count of pages: " + books[i].getCountOfPages());
        }

        books[0] = fourthBook;
        books[3] = firstBook;

        for (int i = 0; i < books.length; i++) {
            System.out.println("Name of book is " + books[i].getName() + "; Count of pages: " + books[i].getCountOfPages());
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println("Name of book is " + books[i].getName() + "; Count of pages: " + books[i].getCountOfPages());
            }
        }

    }

}
