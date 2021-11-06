package com.pb.budiak.hw5;

import java.util.Arrays;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Приключения", "Иванов И. И.", 2000),
                new Book("Словарь", "Сидоров А. В.", 1980),
                new Book("Энциклопедия", "Гусев К. В.", 2010)
        );

        List<Reader> readers = Arrays.asList(
                new Reader("Петров В. В.", 1, "math", "1990-05-12", "9379992"),
                new Reader("Сидоров В. В.", 2, "physics", "1991-04-13", "9379993"),
                new Reader("Иванов В. В.", 3, "it", "1993-01-20", "9379994")
        );
        

        //takeBook
        readers.get(0).takeBook(books.size());
        String[] takeArrBooks = {books.get(0).getName(), books.get(1).getName(), books.get(2).getName()};
        readers.get(1).takeBook(takeArrBooks);
        readers.get(2).takeBook(books);

        //returnBook
        readers.get(0).returnBook(books.size());
        String[] returnArrBook = {books.get(0).getName(), books.get(1).getName(), books.get(2).getName()};
        readers.get(1).returnBook(returnArrBook);
        readers.get(2).returnBook(books);
    }
}
