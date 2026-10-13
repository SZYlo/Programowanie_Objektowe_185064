import java.util.Scanner;

public class zad2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();

        // parzysta

        if (n%2==0){
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("liczba jest nieparzysta");
        }

        // przez 3

        if (n%3==0){
            System.out.println("Liczba jest podzielna przez 3");
        }
        else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }

        //suma

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("Suma jest równa: " + suma);

        //suma parzsta
        int ile = 0;

        for (int i = 1; i < n; i+=2) {
            ile += 1;
        }
        System.out.println("Suma jest równa: " + ile);


    }
}
