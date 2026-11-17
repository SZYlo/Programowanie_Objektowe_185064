//-----------------------Zad 9-----------------------
class Parent {
    String value = "Parent";

    String getValue() {
        return "Parent";
    }
}

class Child extends Parent {
    String value = "Child";

    @Override
    String getValue() {
        return "Child";
    }
}

public class Zadanie09_PolaAMetody {
    public static void main(String[] args) {
        Parent object = new Child();

        System.out.println(object.value);      // wypisze: Parent
        System.out.println(object.getValue()); // wypisze: Child

        // Wyjasnienie:
        // Pola nie podlegaja polimorfizmowi wiec object.value odczytuje pole z klasy referencji 
        // Metody podlegaja polimorfizmowi wiec object.getValue() wywoluje metode z rzeczywistego obiektu 
    }
}
