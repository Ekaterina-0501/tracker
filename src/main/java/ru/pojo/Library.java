package ru.pojo;

public class Library {
    public static void main(String[] args) {
        Book novel = new Book("Titanic", 1050);
        Book textbook = new Book("Clean code", 884);
        Book fantasy = new Book("Armageddon", 556);
        Book instruction = new Book("Vacuum cleaner", 28);
        Book[] books = {novel, textbook, fantasy, instruction};
        for (Book book : books) {
            System.out.println(book.getName() + "  " + book.getPages() + " pages");
        }
        System.out.println();
        System.out.println("Swapped 0 and 3");
        Book change = books[0];
        books[0] = books[3];
        books[3] = change;
        for (Book book : books) {
            System.out.println(book.getName() + "  " + book.getPages() + " pages");
        }
        System.out.println();
        System.out.println("Output Clean code");
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + "  " + book.getPages() + " pages");
            }
        }
    }
}
