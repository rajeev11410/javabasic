import java.util.*;

class Book {
    private String name;
    private String author;
    private String issuedTo;
    private Date issuedOn;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }

    public Date getIssuedOn() {
        return issuedOn;
    }

    public void setIssuedOn(Date issuedOn) {
        this.issuedOn = issuedOn;
    }

    @Override
    public String toString() {
        return "Book Name: " + name + ", Author: " + author + ", Issued To: " + issuedTo + ", Issued On: " + issuedOn;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String name, String author) {
        Book book = new Book(name, author);
        books.add(book);
    }

    public void issueBook(String name, String issuedTo, Date issuedOn) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name) && book.getIssuedTo() == null) {
                book.setIssuedTo(issuedTo);
                book.setIssuedOn(issuedOn);
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String name) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name) && book.getIssuedTo() != null) {
                book.setIssuedTo(null);
                book.setIssuedOn(null);
                return;
            }
        }
        System.out.println("Book not issued or does not exist.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class Liberary{
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook("Java Programming", "John Doe");
        library.addBook("Python Basics", "Jane Smith");

        // Displaying books in the library
        library.displayBooks();

        // Issuing a book
        library.issueBook("Java Programming", "Alice", new Date());
        library.displayBooks();

        // Returning a book
        library.returnBook("Java Programming");
        library.displayBooks();
    }
}
