package ru.mirea.pr3;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Joan Rowling", "Harry Potter", 512);
        Book d2 = new Book("Agatha Christie", "Killing in the Order express", 750);
        Book d3 = new Book("Athur Conan Doyle", "Sherlock Holmes", 567);
        d3.setDescription("Bruh");
        System.out.print("first book: ");System.out.println(d1);
        d2.setAuthorName("Dan Brown");
        System.out.print("second book: ");System.out.print(d2);
    }
}