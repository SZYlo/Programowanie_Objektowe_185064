
class Car {
    void showInformation() {
        System.out.println("Informacje o samochodzie.");
    }
}

public class zad9 {
    public static void main(String[] args) {
        Car car = null;

        if (car != null) {
            car.showInformation();
        } else {
            System.out.println("Brak obiektu Car!");
        }
    }
}
