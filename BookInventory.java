import java.util.*;

public class BookInventory {
    Map<String, Book> inventory = new HashMap<>();

    void addBook(Book book) {
        inventory.put(book.isbn, book);
        System.out.println("Quantum book store: Added " + book.title);
    }

    // remove books older than 'years' from now
    List<Book> removeOutdatedBooks(int years) {
        List<Book> removed = new ArrayList<>();
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        Iterator<Book> it = inventory.values().iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (thisYear - b.year > years) {
                removed.add(b);
                it.remove();
                System.out.println("Quantum book store: Removed " + b.title);
            }
        }
        return removed;
    }

    double buyBook(String isbn, int quantity, String email, String address) throws Exception {
        Book b = inventory.get(isbn);
        if (b == null)
            throw new Exception("Quantum book store: Book not found");
        if (!b.isAvailable())
            throw new Exception("Quantum book store: Book not for sale");

        if (b instanceof PaperBook) {
            double amt = ((PaperBook) b).buy(quantity);
            // pretend to ship
            new ShippingService().ship((PaperBook) b, address);
            return amt;
        }
        if (b instanceof EBook) {
            if (quantity != 1)
                throw new Exception("Quantum book store: Only one ebook per purchase");
            double amt = ((EBook) b).buy(email);
            // pretend to mail
            new MailService().send((EBook) b, email);
            return amt;
        }
        throw new Exception("Quantum book store: Can't buy this book type");
    }
}
