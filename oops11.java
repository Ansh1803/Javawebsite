import java.util.ArrayList;

class Library {
    private ArrayList<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public void removeBook(String book) {
        books.remove(book);
    }

    public void displayBooks() {
        System.out.println("Books in Library: " + books);
    }
}

public class LibraryExample {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("1984");
        library.addBook("The Great Gatsby");
        library.displayBooks();

        library.removeBook("1984");
        library.displayBooks();
    }
}

/*
Output:
Books in Library: [1984, The Great Gatsby]
Books in Library: [The Great Gatsby]
*/
