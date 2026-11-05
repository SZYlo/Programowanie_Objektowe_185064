package zadanie8;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "'" + title + "' autorstwa " + author + " (rok: " + publicationYear + ")";
    }
}

public class Zadanie8 {
    public static void main(String[] args) {
        Book book = new Book("Wiedźmin", "Andrzej Sapkowski", 1990);
        System.out.println(book);
        System.out.println(book.getClass());
    }
}
