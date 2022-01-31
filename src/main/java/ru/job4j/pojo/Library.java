package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book0 = new Book("Дюна", 100500);
        Book book1 = new Book("Ведьмак", 2000);
        Book book2 = new Book("Влестелин Колец", 1200);
        Book book3 = new Book("Clean code", 300);

        Book[] books = new Book[4];
        books[0] = book0;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;

        printLibrary(books);

        Book tempBook = books[0];
        //tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;

        printLibrary(books);

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " - стр.: " + books[i].getNumberOfPage());
            }
        }
    }

    public static void printLibrary(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - стр.: " + books[i].getNumberOfPage());
        }
        System.out.println();
    }
}
