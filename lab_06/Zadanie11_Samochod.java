// Zadanie 11: Samochod zbudowany przez kompozycje
class Engine {
    public void start() {
        System.out.println("Silnik uruchomiony.");
    }
}

class Gearbox {
    public void setGear(int gear) {
        System.out.println("Ustawiono bieg: " + gear);
    }
}

class Car {
    private Engine engine;
    private Gearbox gearbox;

    public Car(Engine engine, Gearbox gearbox) {
        this.engine = engine;
        this.gearbox = gearbox;
    }

    public void start() {
        engine.start();
        gearbox.setGear(1);
        System.out.println("Samochod gotowy do jazdy.");
    }
}

// Dlaczego dziedziczenie byloby tutaj bledem modelowania?
// Samochod nie jest silnikiem ani skrzynia biegow (brak relacji IS-A).
// Poza tym w Javie klasa nie moze dziedziczyc po dwoch klasach jednoczesnie.
public class Zadanie11_Samochod {
    public static void main(String[] args) {
        Car car = new Car(new Engine(), new Gearbox());
        car.start();
    }
}
