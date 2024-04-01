class Book<T> implements Readable {
    private T title;
    
    public Book(T title) {
        this.title = title;
    }
@Override
    public String getTitle() {
        return title.toString();
    }
}
//Теперь Book реализует интер-с Readable для получения названия книги