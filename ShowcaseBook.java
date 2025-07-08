// represents a book that's only for demo, not for sale
public class ShowcaseBook extends Book {
    ShowcaseBook(String isbn, String title, int year, double price, String author) {
        super(isbn, title, year, price, author);
    }

    boolean isAvailable() {
        return false;
    }

    void showDemo() {
        System.out.println("Quantum book store: Showing demo of " + title);
    }
}
