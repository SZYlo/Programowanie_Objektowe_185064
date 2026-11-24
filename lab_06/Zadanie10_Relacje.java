// Zadanie 10: Dziedziczenie czy kompozycja?
public class Zadanie10_Relacje {
    public static void main(String[] args) {
        System.out.println("1. Car - Engine: kompozycja/agregacja (HAS-A - samochod ma silnik)");
        System.out.println("2. Dog - Animal: dziedziczenie (IS-A - pies jest zwierzeciem)");
        System.out.println("3. House - Address: kompozycja/agregacja (HAS-A - dom ma adres)");
        System.out.println("4. Manager - Employee: dziedziczenie (IS-A - menedzer jest pracownikiem)");
        System.out.println("5. Computer - Processor: kompozycja/agregacja (HAS-A - komputer ma procesor)");
        System.out.println("6. Student - University: inna asocjacja (USES-A - student studiuje na uczelni)");
        System.out.println("7. Book - Author: inna asocjacja (HAS-A - ksiazka ma autora, ale istnieja osobno)");
        System.out.println("8. Order - PaymentMethod: kompozycja/agregacja (USES-A - zamowienie uzywa metody platnosci)");
    }
}
