public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Pole 'name' nie może być null ani pustym napisem.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Pole 'age' musi należeć do przedziału od 0 do 150.");
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Pole 'email' powinno zawierać znak '@'.");
        }
        this.email = email;
    }

    /*
     * ODPOWIEDŹ NA PYTANIE Z ZADANIA 2:
     * Nie zawsze. W wielu systemach np. imie (lub id) ustala sie raz w konstruktorz
     */
    public static void main(String[] args) {
        Person p = new Person("Jan Kowalski", 30, "jan.kowalski@example.com");
        System.out.println("Utworzono osobę: " + p.getName() + ", wiek: " + p.getAge() + ", email: " + p.getEmail());
    }
}
