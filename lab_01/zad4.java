import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //brak (wykrywa kompilator);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) {
        //zły operator porówniania (kompilator wykrywa błąd jednak podaje błędne rozwiązanie)
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta");
        //brak (wykrywa kompilator);
        }

        for (int i = 0; i <= 5; i++) {
        //-- zamiast ++ powstaje nieskończona pętla do -nieskończoności (widoczne dopiero po uruchomieniu)
            System.out.println(i);
        }

        scanner.close();
    }
}