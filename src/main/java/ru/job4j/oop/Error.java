package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public static void main(String[] args) {
        Error defaultError = new Error();
        Error error = new Error(true, 404, "bad connection");
        Error error1 = new Error(false, 405, "wrong adress");
        Error error2 = new Error(false, 77, "no computer");

        defaultError.printInfo();
        error.printInfo();
        error1.printInfo();
        error2.printInfo();


    }

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
}
