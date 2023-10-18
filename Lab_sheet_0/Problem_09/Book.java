package Lab_sheet_0.Problem_09;

/* 9. Create a class Book with attributes title, author, and publication year.
Set the access of the attributes to private. Implement the following
methods.
- showBookDetails */

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    // Constructor
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Method to show book details
    public void showBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }

    public static void main(String[] args) {
        Book book = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        book.showBookDetails();
    }
}

