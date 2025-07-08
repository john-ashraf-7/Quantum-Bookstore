public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        BookInventory inv = new BookInventory();

        PaperBook p = new PaperBook("P1", "Paper Book", 2012, 15.0, "Alice", 5);
        EBook e = new EBook("E1", "EBook", 2022, 5.0, "Bob", "pdf");
        ShowcaseBook s = new ShowcaseBook("S1", "Showcase", 2015, 0.0, "Carol");

        inv.addBook(p);
        inv.addBook(e);
        inv.addBook(s);

        inv.removeOutdatedBooks(10);

        try {
            double paid = inv.buyBook("P1", 2, "", "123 Road");
            System.out.println("Quantum book store: Paid for paper book: " + paid);

            paid = inv.buyBook("E1", 1, "user@mail.com", "");
            System.out.println("Quantum book store: Paid for ebook: " + paid);

            // this should fail
            inv.buyBook("S1", 1, "", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
