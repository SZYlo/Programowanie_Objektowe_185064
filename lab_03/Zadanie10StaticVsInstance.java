public class Zadanie10StaticVsInstance {
    /*
     * ZADANIE 10
     *
     * 1. studentName w klasie Student - INSTANCYJNY
     *    KaZdy student ma wLasne, indywidualne imiE i nazwisko.
     *
     * 2. numberOfStudents w klasie Student - STATYCZNY 
     *    Licznik okresla laczna liczbe wszystkich utworzonych obiektow klasy Student,
     *    jest wspoldzielony na poziomie calej klasy.
     *
     * 3. PI w klasie matematycznej - STATYCZNY (static final)
     *     Stala matematyczna PI ma zawsze taka sama wartosc niezaleznie od jakiegokolwiek obiektu.
     *
     * 4. balance w klasie BankAccount - INSTANCYJNY
     *    Kazde konto bankowe posiada wlasny stan srodkow .
     *
     * 5. calculateVat(double price) w bezstanowej klasie pomocniczej - STATYCZNY 
     *    Metoda narzedziowa (utility method) nie korzysta z pol obiektu, wynik zalezy wylacznie
     *    od przekazanego parametru price, wiec tworzenie obiektu do jej wywolania jest zbedne.
     *
     * 6. carMileage w klasie Car - INSTANCYJNY
     *    Przebieg jest cecha konkretnego egzemplarza samochodu.
     *
     * 7. MAX_LOGIN_ATTEMPTS w klasie LoginPolicy - STATYCZNY (static final)
     *    Jest to globalna stala okreslajaca regule bezpieczenstwa wspolna dla calej polityki logowania.
     */

    public static void main(String[] args) {
    }
}
