package org.example;

public class Book {
    public int bookId;
    String bookName;
    String bookAuthor;
    String genre;
    boolean isBorrowed;

    public Book(int bookId, String bookName, String bookAuthor, String genre, boolean isBorrowed) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.genre = genre;
        this.isBorrowed = isBorrowed;
    }

    public String getBookName() {
        return bookName;
    }

    public Book setBookName(String bookName) {
        this.bookName = bookName;
        return new Book(this.bookId, this.bookName, this.bookAuthor, this.genre, this.isBorrowed);
    }
}
