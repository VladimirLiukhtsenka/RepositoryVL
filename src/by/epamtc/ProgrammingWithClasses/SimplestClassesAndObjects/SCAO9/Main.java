package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO9;

import java.util.ArrayList;

/*
9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Last Sumurai", "Helen Devitt", "Olma",
                1999, 250, 20, "hard cover"));
        books.add(new Book(2, "Amendments", "Djonatan Franzen", "Phenix",
                2001, 400, 35, "mild cover"));
        books.add(new Book(3, "Freedom", "Djonatan Franzen", "Uventa",
                1985, 300, 25, "hard cover"));
        books.add(new Book(4, "Selling creature", "Pol Beite", "Olma",
                2005, 180, 15, "hard cover"));
        books.add(new Book(5, "Platform", "Mishel Ulbeck", "Rosmen",
                2003, 330, 30, "mild cover"));
        Library library = new Library(books);
        LibraryView libraryView = new LibraryView();
        //список книг заданного автора;
        libraryView.printByGivenAuthor(library, "Djonatan Franzen");
        System.out.println();
        //список книг, выпущенных заданным издательством;
        libraryView.printByGivenPublishHouse(library, "Olma");
        System.out.println();
        //список книг, выпущенных после заданного года.
        libraryView.printbooksAfterGivenYear(library, 2000);
    }
}
