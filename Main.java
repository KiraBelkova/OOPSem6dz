import java.util.HashMap;
import java.util.Map;

import javax.smartcardio.Card;

public class Main {
    public static void main(String[] args) {
Library library = new Library();

        Book<String> book1 = new Book<>("Book 1");
        Book<String> book2 = new Book<>("Book 2");

        library.addBook(book1);
        library.addBook(book2);

        Card<Integer, Readable> card1 = new LibraryCard<>(1, book1);
        Card<Integer, Readable> card2 = new LibraryCard<>(2, book2);

        library.issueBook(card1);
        library.printIssuedBooks();
    }
}