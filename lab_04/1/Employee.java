package zadanie1_2.employee;
import zadanie1_2.person.Person;

public class Employee extends Person {
    private String position;

    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public void displayData() {
        // System.out.println(firstName); // Niedostępne: firstName ma modyfikator private
        System.out.println("Imię (przez getter): " + getFirstName());
        System.out.println("Nazwisko (protected): " + lastName); // Dostępne, bo to podklasa
        System.out.println("Stanowisko: " + position);
    }
}
