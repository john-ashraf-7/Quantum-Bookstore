// represents a physical book with stock
public class PaperBook extends Book {
    int stock;

    PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    boolean isAvailable() {
        return stock > 0;
    }

    double buy(int quantity) throws Exception {
        if (quantity > stock)
            throw new Exception("Quantum book store: Not enough stock");
        stock -= quantity;
        // pretend to ship the book
        System.out.println("Quantum book store: Shipping " + quantity + " of " + title);
        return price * quantity;
    }
}
