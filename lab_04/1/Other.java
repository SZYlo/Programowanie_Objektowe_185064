package zadanie1_2.employee;
import zadanie1_2.person.Person;

public class Other {
    public void testAccess() {
        Person p = new Person("Jan", "Kowalski");
        // p.firstName; // Niedostępne (private)
        // p.lastName; // Niedostępne (protected nie pozwala na dostęp klasom z INNEGO pakietu, które nie dziedziczą)
    }
}
