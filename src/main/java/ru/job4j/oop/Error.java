package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error errorFirst = new Error();
        errorFirst.printInfo();
        Error errorSecond = new Error(true, 403, "HTTP 403 Forbidden");
        errorSecond.printInfo();
        Error errorThird = new Error(true, 404, "HTTP 404 Not Found");
        errorThird.printInfo();
        Error errorFourth = new Error(true, 500, "500 Internal Server Error");
        errorFourth.printInfo();
    }

}
