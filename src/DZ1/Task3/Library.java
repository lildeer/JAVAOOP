package DZ1.Task3;

import java.util.ArrayList;

public class Library implements LibImp{
    private ArrayList<Book> catalog;

    public void AddBook(Book book) {
        catalog.add(book);
    }

    public void DeleteBook(Book book) {
        if (catalog.contains(book)) {
            catalog.remove(book);
        }
    }

    public void displayAvailableBooks() {
        for (Book book : catalog
        ) {
            if (book.getAvailable()) {
                book.displayInfo();
            }
        }
    }

    public void searchByAuthor(String author) {
        for (Book book : catalog
        ) {
            if (book.getAuthor().equals(author)) {
                book.displayInfo();
            }
        }
    }
}