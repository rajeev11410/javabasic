import java.util.ArrayList;

public class Library {
    private ArrayList<String> availableBooks;
    private ArrayList<String> issuedBooks;

    public Library() {
        availableBooks = new ArrayList<>();
        issuedBooks = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(String bookTitle) {
        availableBooks.add(bookTitle);
        System.out.println(bookTitle + " added to the library.");
    }

    // Method to issue a book from the library
    public void issueBook(String bookTitle) {
        if (availableBooks.contains(bookTitle)) {
            availableBooks.remove(bookTitle);
            issuedBooks.add(bookTitle);
            System.out.println(bookTitle + " issued successfully.");
        } else {
            System.out.println(bookTitle + " not available for issuing.");
        }
    }

    // Method to return a book to the library
    public void returnBook(String bookTitle) {
        if (issuedBooks.contains(bookTitle)) {
            issuedBooks.remove(bookTitle);
            availableBooks.add(bookTitle);
            System.out.println(bookTitle + " returned successfully.");
        } else {
            System.out.println(bookTitle + " not issued from this library.");
        }
    }

    // Method to show available books in the library
    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (String book : availableBooks) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        // Example usage
        Library library = new Library();
        library.addBook("Java Programming");
        library.addBook("Data Structures and Algorithms");
        library.addBook("Introduction to Python");

        library.showAvailableBooks();

        library.issueBook("Java Programming");
        library.issueBook("C++ Programming");

        library.returnBook("Java Programming");

        library.showAvailableBooks();
    }
}
