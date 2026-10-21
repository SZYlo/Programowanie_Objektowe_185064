public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }



    public Book(String title, String author) {
        this(title, author, 0);
    }


    public Book() {
        this("Nieznany", "Nieznany", 0);
    }


}

void main() {
    Book b1 = new Book("Harry Potter", "Rwoling", 2007 );
    Book b2 = new Book("Władcca Pierścieni", "Tolkien");
    Book b3 = new Book();
}