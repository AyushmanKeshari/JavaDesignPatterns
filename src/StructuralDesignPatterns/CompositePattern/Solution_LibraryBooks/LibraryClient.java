package StructuralDesignPatterns.CompositePattern.Solution_LibraryBooks;

public class LibraryClient {

  public static void main(String[] args) {

    NonfictionBook nonfictionBook = new NonfictionBook("A Brief History of Time");
    FictionBook fictionBookOne = new FictionBook("Hamlet", true);
    FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);

    BookCollection bookCollection = new BookCollection();
    bookCollection.addBooks(nonfictionBook);
    bookCollection.addBooks(fictionBookOne);
    bookCollection.addBooks(fictionBookTwo);

    checkoutBookType(nonfictionBook);
    checkoutBookType(fictionBookOne);
    checkoutBookType(bookCollection);

    returnBookType(nonfictionBook);
    returnBookType(fictionBookOne);
    returnBookType(bookCollection);

  }

  public static void checkoutBookType(Books books) {
    books.checkout();
  }

  public static void returnBookType(Books books) {
    books.returnBook();
  }

}
