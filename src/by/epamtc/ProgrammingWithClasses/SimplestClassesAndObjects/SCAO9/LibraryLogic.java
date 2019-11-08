package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO9;

import java.util.ArrayList;

public class LibraryLogic {

    public ArrayList<Book> booksByGivenAuthor(Library library, String aughtor) {
        ArrayList<Book> booksByGivenAuthor = new ArrayList<>();
        for (Book book : library.getLibrary()) {
            if (book.getAuthor().contains(aughtor)) booksByGivenAuthor.add(book);
        }
        return booksByGivenAuthor;
    }

    public ArrayList<Book> booksByGivenPublishHouse(Library library, String publishingHouse) {
        ArrayList<Book> booksByGivenPublishHouse = new ArrayList<>();
        for (Book book : library.getLibrary()) {
            if (book.getPublishingHouse().contains(publishingHouse)) booksByGivenPublishHouse.add(book);
        }
        return booksByGivenPublishHouse;
    }

    public ArrayList<Book> booksAfterGivenYear(Library library, int year) {
        ArrayList<Book> booksAfterGivenYear = new ArrayList<>();
        for (Book book : library.getLibrary()) {
            if (book.getYearOfPublishing() > year) booksAfterGivenYear.add(book);
        }
        return booksAfterGivenYear;
    }
}
