// fake mail service for ebooks
public class MailService {
    void send(EBook book, String email) {
        System.out.println("Quantum book store: Sending " + book.title + " to " + email);
    }
}
