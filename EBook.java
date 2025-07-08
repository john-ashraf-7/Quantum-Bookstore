// represents an ebook with a filetype
public class EBook extends Book {
    String filetype;

    EBook(String isbn, String title, int year, double price, String author, String filetype) {
        super(isbn, title, year, price, author);
        this.filetype = filetype;
    }

    boolean isAvailable() {
        return true; // always available
    }

    double buy(String email) {
        // pretend to send the ebook
        System.out.println("Quantum book store: Sending " + title + " to " + email);
        return price;
    }
}
