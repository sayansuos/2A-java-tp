package fr.ensai.library;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());

        String name = "Marmottes";
        List<Item> books = new ArrayList<Item>(List.of(fellowshipOfTheRing));
        Magazine magazine1 = new Magazine("un magazine nul", 0, 0, "abcd", "efgh");
        Magazine magazine2 = new Magazine("un magazine bien", 0, 0, "abcd", "efgh");
        Library library = new Library(name, books);
        library.loadBooksFromCSV("books.csv");
        library.addItem(magazine1);
        library.addItem(magazine2);
        library.displayItems();
    }
}