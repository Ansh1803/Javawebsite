import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
    }
}

public class LibraryExample {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell", "123456789"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "987654321"));

        library.displayBooks();
        library.removeBook("123456789");
        library.displayBooks();
    }
}

/*
Output:
Title: 1984, Author: George Orwell, ISBN: 123456789
Title: The Hobbit, Author: J.R.R. Tolkien, ISBN: 987654321
Title: The Hobbit, Author: J.R.R. Tolkien, ISBN: 987654321
*/
