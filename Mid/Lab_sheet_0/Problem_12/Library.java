package Lab_sheet_0.Problem_12;

/* 12. Create a class Library with a list of books. Implement methods to
add a book, remove a book, and search for a book by title. Set the
access of the attributes to private. */

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book by title
    public void removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found.");
    }

    // Method to search for a book by title
    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Book Title 1");
        Book book2 = new Book("Book Title 2");

        library.addBook(book1);
        library.addBook(book2);

        // Search for a book by title
        String searchTitle = "Book Title 1";
        Book foundBook = library.searchBookByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle());
        } else {
            System.out.println("Book not found.");
        }

        // Remove a book
        String removeTitle = "Book Title 2";
        library.removeBook(removeTitle);

        // Try to find the removed book
        foundBook = library.searchBookByTitle(removeTitle);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }
}

