// fake shipping service for paper books
public class ShippingService {
    void ship(PaperBook book, String address) {
        System.out.println("Quantum book store: Shipping " + book.title + " to " + address);
    }
}
