class Library {
    private Map<Card<Integer, Readable>, Readable> issuedBooks;

    public Library() {
        issuedBooks = new HashMap<>();
    }

    public void addBook(Readable book) {
        Card<Integer, Readable> card = new LibraryCard<>(issuedBooks.size()+1, book);
        issuedBooks.put(card, book);
    }
public void issueBook(Card<Integer, Readable> card) {
        issuedBooks.remove(card);
    }

    public void printIssuedBooks() {
        for (Map.Entry<Card<Integer, Readable>, Readable> entry : issuedBooks.entrySet()) {
            System.out.println("Card Number: " + entry.getKey().getCardNumber());
            System.out.println("Book Title: " + entry.getValue().getTitle());
        }
    }
}
//Класс Library теперь работает с интерфейсами Card и Readable. Так уменьшаю зависимости.