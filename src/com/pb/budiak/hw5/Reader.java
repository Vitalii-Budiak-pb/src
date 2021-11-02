package com.pb.budiak.hw5;

import java.util.List;
import java.util.stream.Collectors;

public class Reader {
    private String fio;
    private int libraryCardNumber;
    private String faculty;
    private String birthday;
    private String phone;

    public Reader(String fio, int libraryCardNumber, String faculty, String birthday, String phone) {
        this.fio = fio;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    void takeBook(int countBook) {
        System.out.println(fio + " взял " + countBook + " книги ");
    }

    void takeBook(String... books) {
        String allNameBooks = String.join(", ", books);
        System.out.println(fio + " взял книги: " + allNameBooks);
    }

    void takeBook(List<Book> books) {
        List<String> booksInfo = books.stream().map(Reader::getBookInfo).collect(Collectors.toList());
        String allNameBooks = String.join(", ", booksInfo);
        System.out.println(fio + " взял книги: " + allNameBooks);
    }

    void returnBook(int countBook) {
        System.out.println(fio + " вернул " + countBook + " книги ");
    }

    void returnBook(String... books) {
        String allNameBooks = String.join(", ", books);
        System.out.println(fio + " вернул книги: " + allNameBooks);
    }

    void returnBook(List<Book> books) {
        List<String> booksInfo = books.stream().map(Reader::getBookInfo).collect(Collectors.toList());
        String allNameBooks = String.join(", ", booksInfo);
        System.out.println(fio + " вернул книги: " + allNameBooks);
    }

    static String getBookInfo(Book book) {
        return book.getName() + " " + "(" + book.getAuthor() + " " + book.getYear() + " г.)";
    }
}
