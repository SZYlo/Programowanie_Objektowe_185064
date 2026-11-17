// Zadania 1, 2, 3, 5, 6, 7, 8, 10, 11 - polaczone wspolna hierarchia klas Animal

class Animal {
    //-----------------------Zad 5-----------------------
    String name = "Zwierze";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Zwierze wydaje dzwiek");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + name + ")";
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Hau hau");
    }

    // Metoda dodana w Zadaniu 6
    public void digHole() {
        System.out.println("Pies kopie dolek");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }

    //-----------------------zad 6-----------------------
    public void climb() {
        System.out.println("Kot wspina sie na drzewo");
    }
}

// Klasy dodane w Zadaniu 2
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Muuu");
    }
}

class Sheep extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Beee");
    }
}

// Klasa dodana w Zadaniu 11
class GuideDog extends Dog {
    @Override
    public void makeSound() {
        System.out.println("Hau hau (pies przewodnik)");
    }
}

public class Zadania_Animal {

    //-----------------------Zad 3-----------------------
    public static void present(Animal animal) {
        System.out.println(animal);
        animal.makeSound();
    }

    //-----------------------Zad 7-----------------------
    public static void specialAction(Animal animal) {
        if (animal instanceof Dog dog) {
            dog.digHole();
        } else if (animal instanceof Cat cat) {
            cat.climb();
        }
    }

    //-----------------------Zad 8-----------------------
    public static void makeSound(Animal animal) {
        animal.makeSound();
    }

    //-----------------------Zad 10-----------------------
    static void identify(Animal animal) {
        System.out.println("Animal");
    }

    static void identify(Dog dog) {
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        System.out.println("=== ZADANIE 1 ===");
        Animal first = new Dog();
        Animal second = new Cat();
        first.makeSound();
        second.makeSound();
        // -----------------------Zad 1-----------------------
        // 1. Typ referencji first Animal
        // 2. Rzeczywisty typ obiektu Dog
        // 3. Wykonana wersja makeSound() z klasy Dog
        // 4. Czy przez first mozna wywolac metode tylko z Dog, nie kompilator widzi tylko metody z Animal

        System.out.println("\n=== ZADANIE 2 ===");
        Animal[] animals = {
            new Animal(),
            new Dog(),
            new Cat(),
            new Cow(),
            new Sheep()
        };
        for (Animal a : animals) {
            a.makeSound();
        }

        System.out.println("\n=== ZADANIE 3 ===");
        present(new Dog());
        present(new Cat());
        present(new Cow());
        // ------------------------Zad 3-----------------------
        // Nie potrzebujemy trzech metod bo Dog Cat i Cow dziedzicza po Animal
        // Jedna metoda przyjmujaca typ bazowy obsluzy kazda podklase

        System.out.println("\n=== ZADANIE 5 ===");
        Dog dog = new Dog();
        Animal animal = dog; // upcasting
        dog.makeSound();
        dog.digHole();    // przez dog mozna wywolac metody Animal i Dog
        animal.makeSound(); // przez animal mozna wywolac tylko metody Animal
        dog.setName("Burek");
        System.out.println("Odczyt przez animal: " + animal.getName());
        //-----------------------Zad 5-----------------------
        // Upcasting nie tworzy nowego obiektu obie referencje wskazuja na ten sam obiekt w pamieci

        System.out.println("\n=== ZADANIE 6 ===");
        Animal firstAnimal = new Dog();
        Animal secondAnimal = new Cat();
        if (firstAnimal instanceof Dog d) {
            d.digHole();
        }
        if (secondAnimal instanceof Cat c) {
            c.climb();
        }
        try {
            Dog wrongCast = (Dog) secondAnimal;
        } catch (ClassCastException e) {
            System.out.println("Zgloszony wyjatek: " + e);
        }

        System.out.println("\n=== ZADANIE 7 ===");
        specialAction(new Dog());
        specialAction(new Cat());

        System.out.println("\n=== ZADANIE 8 ===");
        makeSound(new Dog());
        makeSound(new Cow());
        makeSound(new Sheep());
        //-----------------------Zad 8-----------------------
        // Nowa wersja jest rozszerzalna, bo dodanie nowej podklasy Animal nie wymaga zmian w metodzie makeSound()

        System.out.println("\n=== ZADANIE 10 ===");
        Animal polyAnimal = new Dog();
        identify(polyAnimal);     // kompilator wybierze identify(Animal) wypisze Animal
        polyAnimal.makeSound();   // JVM wykona makeSound() z Dog  wypisze Hau hau
        //-----------------------Zadanie 10-----------------------
        // identify wybiera kompilator na podstawie typu referencji
        // makeSound wybiera JVM w trakcie dzialania na podstawie typu obiektu 

        System.out.println("\n=== ZADANIE 11 ===");
        Animal guide = new GuideDog();
        System.out.println(guide instanceof Animal);           // true
        System.out.println(guide instanceof Dog);              // true
        System.out.println(guide instanceof GuideDog);         // true
        System.out.println(guide.getClass() == Animal.class);  // false
        System.out.println(guide.getClass() == Dog.class);     // false
        System.out.println(guide.getClass() == GuideDog.class);// true
    }
}
