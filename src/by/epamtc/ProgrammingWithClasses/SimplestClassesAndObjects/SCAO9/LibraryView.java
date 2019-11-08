package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO9;

import java.util.ArrayList;

public class LibraryView {

    public void printByGivenAuthor(Library library, String aughtor) {
        LibraryLogic libraryLogic = new LibraryLogic();
        ArrayList<Book> list = libraryLogic.booksByGivenAuthor(library, aughtor);
        System.out.println("The " + aughtor + " wrote:");
        printList(list);
    }

    public void printByGivenPublishHouse(Library library, String publishingHouse) {
        LibraryLogic libraryLogic = new LibraryLogic();
        ArrayList<Book> list = libraryLogic.booksByGivenPublishHouse(library, publishingHouse);
        System.out.println("The " + publishingHouse + " released:");
        printList(list);
    }

    public void printbooksAfterGivenYear(Library library, int year) {
        LibraryLogic libraryLogic = new LibraryLogic();
        ArrayList<Book> list = libraryLogic.booksAfterGivenYear(library, year);
        System.out.println("After year: " + year);
        printList(list);
    }

    private void printList(ArrayList<Book> list) {
        for (Book book : list) {
            System.out.println(book.getName() + ", y:" + book.getYearOfPublishing());
        }
    }

}
