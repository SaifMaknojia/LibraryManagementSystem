package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class BookScanner {
    public Book CustomScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets add the book details now");

        System.out.print("Enter the book Name: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter the book Author: ");
        String bookAuthor = scanner.nextLine();

        System.out.print("Enter the Genre: ");
        String genre = scanner.nextLine();

        System.out.print("is the book Available. Type 1 for yes and 2 for no: ");
        int availability = scanner.nextInt();

        boolean isAvailable = availability == 1 ? true : false;

        HashMap<String, Book> bookHashMap = new HashMap<>();

        return new Book(1, bookName, bookAuthor, genre, isAvailable);

    }
}
