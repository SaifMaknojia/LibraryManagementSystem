package org.example;

import java.util.HashMap;
import java.util.List;

public class BookDatabase {
    public void fakeData(List<Book> bookArray, HashMap bookHashMap) {
        Book book = new Book(1, "Sky is Falling", "Sidney Sheldon", "Thriller", false);
        bookArray.add(book);
        bookArray.add(new Book(2, "2 State", "Chetan Bhagat", "Romance", true));
        bookArray.add(new Book(3, "Rich Dad poor Dad", "Robert T", "Finance", false));
        bookArray.add(new Book(4, "7 habits of highly effective people", "Stephen Covey", "Personal development", true));
        bookArray.add(new Book(5, "Holly", "Stephen King", "Suspense", false));

        for (Book books : bookArray) {
            bookHashMap.put(books.bookId, books);
        }
        System.out.println("For Loop ended in BookData class");
    }
}
