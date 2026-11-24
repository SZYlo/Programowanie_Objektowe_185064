// Zadanie 13 i 14 refaktoryzacja zlego dziedziczenia na kompozycje z interfejsem Storage
// Odpowiedzi do Zadania 13
// 1. Czy ReportService IS-A Database? Nie, serwis raportow nie jest baza danych
// 2. Dlaczego uzyto dziedziczenia? Tylko dla wygody, aby wywolac metode save() bez tworzenia obiektu
// 3. Ponizej kod przebudowany przez kompozycje oraz interfejs Storage (Zadanie 14)

interface Storage {
    void save(String data);
}

class DatabaseStorage implements Storage {
    @Override
    public void save(String data) {
        System.out.println("Zapis do bazy danych: " + data);
    }
}

class FileStorage implements Storage {
    @Override
    public void save(String data) {
        System.out.println("Zapis do pliku tekstowego: " + data);
    }
}

class ConsoleStorage implements Storage {
    @Override
    public void save(String data) {
        System.out.println("Wypisanie na konsole: " + data);
    }
}

class ReportService {
    private Storage storage;

    public ReportService(Storage storage) {
        this.storage = storage;
    }

    public void generateReport() {
        String report = "Raport sprzedazy 2026";
        storage.save(report);
    }
}

public class Zadanie13_14_ReportService {
    public static void main(String[] args) {
        // Zmiana sposobu zapisu bez modyfikowania klasy ReportService
        ReportService dbReport = new ReportService(new DatabaseStorage());
        dbReport.generateReport();

        ReportService fileReport = new ReportService(new FileStorage());
        fileReport.generateReport();

        ReportService consoleReport = new ReportService(new ConsoleStorage());
        consoleReport.generateReport();
    }
}
