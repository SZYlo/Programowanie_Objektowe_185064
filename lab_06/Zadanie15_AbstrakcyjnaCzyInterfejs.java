// Zadanie 15: Klasa abstrakcyjna czy interfejs?
public class Zadanie15_AbstrakcyjnaCzyInterfejs {
    public static void main(String[] args) {
        System.out.println("1. Shape -> Klasa abstrakcyjna");
        System.out.println("   - wspolny stan: tak (np. nazwa, kolor)");
        System.out.println("   - naturalne IS-A: tak (Circle IS-A Shape)");
        System.out.println("   - wiele niezwiazanych klas: nie, tylko figury");
        System.out.println("   - czesciowa implementacja: tak (np. printInformation)");

        System.out.println("2. Printable -> Interfejs");
        System.out.println("   - wspolny stan: nie");
        System.out.println("   - naturalne IS-A: nie, to tylko zdolnosc drukowania");
        System.out.println("   - wiele niezwiazanych klas: tak (Invoice, Ticket, Report)");
        System.out.println("   - czesciowa implementacja: nie");

        System.out.println("3. Employee -> Klasa abstrakcyjna");
        System.out.println("   - wspolny stan: tak (name, baseSalary)");
        System.out.println("   - naturalne IS-A: tak (Developer IS-A Employee)");
        System.out.println("   - wiele niezwiazanych klas: nie, tylko pracownicy");
        System.out.println("   - czesciowa implementacja: tak (np. printPayslip)");

        System.out.println("4. Comparable -> Interfejs");
        System.out.println("   - wspolny stan: nie");
        System.out.println("   - naturalne IS-A: nie, to cecha porownywalnosci");
        System.out.println("   - wiele niezwiazanych klas: tak (String, Integer, Employee)");
        System.out.println("   - czesciowa implementacja: nie");

        System.out.println("5. Vehicle -> Klasa abstrakcyjna");
        System.out.println("   - wspolny stan: tak (predkosc, paliwo)");
        System.out.println("   - naturalne IS-A: tak (Car IS-A Vehicle)");
        System.out.println("   - wiele niezwiazanych klas: nie, tylko pojazdy");
        System.out.println("   - czesciowa implementacja: tak (np. start/stop)");

        System.out.println("6. Encryptable -> Interfejs");
        System.out.println("   - wspolny stan: nie");
        System.out.println("   - naturalne IS-A: nie, to zdolnosc szyfrowania");
        System.out.println("   - wiele niezwiazanych klas: tak (File, Message, Password)");
        System.out.println("   - czesciowa implementacja: nie");

        System.out.println("7. NotificationSender -> Interfejs");
        System.out.println("   - wspolny stan: nie");
        System.out.println("   - naturalne IS-A: nie, to rola wysylania powiadomien");
        System.out.println("   - wiele niezwiazanych klas: tak (EmailSender, SmsSender)");
        System.out.println("   - czesciowa implementacja: nie");

        System.out.println("8. Account -> Klasa abstrakcyjna");
        System.out.println("   - wspolny stan: tak (saldo, numer konta)");
        System.out.println("   - naturalne IS-A: tak (SavingsAccount IS-A Account)");
        System.out.println("   - wiele niezwiazanych klas: nie, tylko konta");
        System.out.println("   - czesciowa implementacja: tak (np. wplata/wyplata)");
    }
}
