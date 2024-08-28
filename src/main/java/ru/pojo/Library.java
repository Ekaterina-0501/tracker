package ru.pojo;

public class Library {
    public static void main(String[] args) {
        Book novel = new Book("Titanic", 1050);
        Book textbook = new Book("Clean code", 884);
        Book fantasy = new Book("Armageddon", 556);
        Book instruction = new Book("Vacuum cleaner", 28);
        Book[] books = new Book[4];
        books[0] = novel;
        books[1] = textbook;
        books[2] = fantasy;
        books[3] = instruction;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + "  " + book.getPages() + " pages");
        }
        System.out.println("");
        System.out.println("Swapped 0 and 3");
        Book change = books[0];
        books[0] = books[3];
        books[3] = change;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + "  " + book.getPages() + " pages");
        }
        System.out.println("");
        System.out.println("Output Clean code");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + "  " + book.getPages() + " pages");
            }
        }
    }
}
