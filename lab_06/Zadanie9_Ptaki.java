// Zadanie 9: Przebudowa hierarchii ptakow z interfejsem Flyable
interface Flyable {
    void fly();
}

abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " je ziarno lub ryby.");
    }
}

class Eagle extends Bird implements Flyable {
    public Eagle() {
        super("Orzel");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " szybuje wysoko.");
    }
}

class Sparrow extends Bird implements Flyable {
    public Sparrow() {
        super("Wrobel");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " szybko macha skrzydlami.");
    }
}

class Penguin extends Bird {
    public Penguin() {
        super("Pingwin");
    }
}

// Dlaczego nowy projekt jest lepszy?
// Pingwin jest ptakiem, ale nie lata. Dzieki wydzieleniu interfejsu Flyable
// klasa Penguin nie dziedziczy zbednej metody fly() i nie lamie zasady Liskov.
public class Zadanie9_Ptaki {
    public static void main(String[] args) {
        Bird[] birds = { new Eagle(), new Sparrow(), new Penguin() };

        for (Bird bird : birds) {
            bird.eat();
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
        }
    }
}
