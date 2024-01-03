package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookArray = new LinkedList<>();
        HashMap<Integer, Book> bookHashMap = new HashMap<>();

        //Calling bookDatabase to for code readability
        BookDatabase bookDatabase = new BookDatabase();
        bookDatabase.fakeData(bookArray, bookHashMap);


        // crud functionality can only be used by librarian for the book.
        bookHashMap.put(4, bookHashMap.get(4).setBookName("Whatever it is"));

        // Just reading entire bookDatabase
        for (int books : bookHashMap.keySet()) {
            System.out.println(bookHashMap.get(books).bookName + ":" + bookHashMap.get(books).bookAuthor);
        }

        BookScanner bookScanner = new BookScanner();
        bookScanner.CustomScanner();
    }

}