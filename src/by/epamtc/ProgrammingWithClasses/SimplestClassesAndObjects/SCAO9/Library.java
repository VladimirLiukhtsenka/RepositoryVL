package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO9;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private ArrayList<Book> library;

    public Library(ArrayList<Book> books) {
        this.library = books;
    }

    public ArrayList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library1 = (Library) o;
        return Objects.equals(library, library1.library);
    }

    @Override
    public int hashCode() {
        return Objects.hash(library);
    }
}
