// Zadanie 4, 5 i 6: Interfejs Printable, wiele interfejsow oraz metoda default
interface Printable {
    void print();

    // Zadanie 6: Metoda domyslna
    default void printHeader() {
        System.out.println("=== DOMYSLNY NAGLOWEK DOKUMENTU ===");
    }
}

interface Exportable {
    void export();
}

interface Savable {
    void save();
}

// Klasa Invoice nadpisuje metode domyslna printHeader()
class Invoice implements Printable {
    private String number;

    public Invoice(String number) {
        this.number = number;
    }

    @Override
    public void printHeader() {
        System.out.println("*** FAKTURA VAT - NAGLOWEK SPECJALNY ***");
    }

    @Override
    public void print() {
        System.out.println("Drukowanie faktury nr: " + number);
    }
}

// Klasa Report implementuje trzy interfejsy i korzysta z domyslnego printHeader()
class Report implements Printable, Exportable, Savable {
    private String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Drukowanie raportu: " + title);
    }

    @Override
    public void export() {
        System.out.println("Eksportowanie raportu do PDF: " + title);
    }

    @Override
    public void save() {
        System.out.println("Zapisywanie raportu na dysku: " + title);
    }
}

class Ticket implements Printable {
    private String event;

    public Ticket(String event) {
        this.event = event;
    }

    @Override
    public void print() {
        System.out.println("Drukowanie biletu na: " + event);
    }
}

public class Zadanie4_5_6_Printable {
    public static void main(String[] args) {
        // Zadanie 4: Tablica interfejsu Printable w jednej petli
        System.out.println("--- Zadanie 4 ---");
        Printable[] elements = {
            new Invoice("FV/2026/01"),
            new Report("Raport roczny"),
            new Ticket("Koncert rockowy")
        };

        for (Printable element : elements) {
            element.print();
        }

        // Zadanie 5: Ten sam obiekt pod roznymi typami referencji
        // Kazda referencja widzi tylko metody ze swojego interfejsu
        System.out.println("\n--- Zadanie 5 ---");
        Report report = new Report("Raport finansowy");

        Printable printable = report;
        printable.print(); // dostepne tylko metody z Printable

        Exportable exportable = report;
        exportable.export(); // dostepne tylko metody z Exportable

        Savable savable = report;
        savable.save(); // dostepne tylko metody z Savable

        // Zadanie 6: Porownanie domyslnej i nadpisanej metody default
        System.out.println("\n--- Zadanie 6 ---");
        Invoice invoice = new Invoice("FV/2026/02");

        report.printHeader();
        report.print();

        invoice.printHeader();
        invoice.print();
    }
}
