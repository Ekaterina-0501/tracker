package ru.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void info() {
        System.out.println("Error " + active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error400 = new Error(true, 400, "Bad Request");
        Error error402 = new Error(false, 402, "Payment Required");
        Error error404 = new Error(true, 404, "Not found");
        Error errorNull = new Error();
        error400.info();
        error402.info();
        error404.info();
        errorNull.info();
    }
}
