class LibraryCard<K, V> implements Card<K, V> {
    private K cardNumber;
    private V bookInfo;

    public LibraryCard(K cardNumber, V bookInfo) {
        this.cardNumber = cardNumber;
        this.bookInfo = bookInfo;
    }
    
    @Override
    public K getCardNumber() {
        return cardNumber;
    }

    @Override
    public V getBookInfo() {
        return bookInfo;
    }
}
//Теперь LibraryCard реализует интерфейс Card для работы с библиотечными карточками