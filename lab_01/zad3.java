import java.util.Scanner;

public class zad3 {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] liczby = new int[10];

        System.out.println("Wprowadz 10 liczb: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Liczba " + (i+1) + ": ");
            liczby[i] = scanner.nextInt();
        }
        int max = liczby[0];
        for (int i = 0; i < liczby.length; i++) {
            if (max < liczby[i]) max = liczby[i];
        }
        System.out.println("Najwieksza to: " + max);

        int min = liczby[0];
        for (int i = 0; i < liczby.length; i++) {
            if (min > liczby[i]) min = liczby[i];
        }
        System.out.println("Najmniejsza to: " + min);

        int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];
        }

        float avr = (float) suma/liczby.length;
        System.out.println("Srednia to: " + avr);

        int ile = 0;
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i]>avr) ile++;
        }

        System.out.println("Ilosc liczb wiekszych od sredniej to: " + ile);
        scanner.close();

    }
}
