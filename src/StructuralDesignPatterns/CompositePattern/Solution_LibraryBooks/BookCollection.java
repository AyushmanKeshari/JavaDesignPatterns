package StructuralDesignPatterns.CompositePattern.Solution_LibraryBooks;

import java.util.ArrayList;

public class BookCollection implements Books {

  private ArrayList<Books> books = new ArrayList();

  public void addBooks(Books books) {
    this.books.add(books);
  }

  public void checkout() {
    books.forEach(Books::checkout);
  }

  public void returnBook() {
    books.forEach(Books::returnBook);
  }
}
