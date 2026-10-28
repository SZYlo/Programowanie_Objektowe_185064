public class User {
    /*
     * ANALIZA PIERWOTNEGO KODU Z ZADANIA 11:
     *
     * 1.
     *    - Metoda `showUser()` byla oznaczona jako `static`, ale odwolywala sie bezposrednio do niestatycznych
     *      pol instancyjnych `login` oraz `password`. Z kontekstu statycznego nie ma dostepu do pol `this`.
     *
     * 2.
     *    - Wszystkie pola (`login`, `password`, `age`) byly publiczne (`public`),
     *    - Pole age bylo statyczne 
     *    - Brak jakiejkolwiek walidacji danych w konstruktorze i setterach.
     *    - Wypisywanie haslaa jawnym tekstem w metodzie `showUser()`.
     *
     * 3.
     *    - Wszystkie trzy pola opisuja konkretnego uzytkownika, wiec musza byc INSTANCYJNE.
     *
     * 5.
     *    - Nie Ze wzgledow bezpieczemstwa haslo nie powinno byc udostepniane na zewnatrz
     */

    private String login;
    private String password;
    private int age;

    public User(String login, String password, int age) {
        if (login == null || login.trim().isEmpty()) {
            throw new IllegalArgumentException("Login nie może być pusty.");
        }
        this.login = login;
        setPassword(password);
        setAge(age);
    }

    public String getLogin() {
        return login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Wiek musi mieścić się w przedziale 0-150.");
        }
        this.age = age;
    }

    public void setPassword(String password) {
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Hasło musi zawierać co najmniej 6 znaków.");
        }
        this.password = password;
    }

    public boolean checkPassword(String candidate) {
        return this.password.equals(candidate);
    }

    public void showUser() {
        System.out.println("Login: " + login + ", hasło: [UKRYTE], wiek: " + age);
    }

    public static void main(String[] args) {
        User u1 = new User("jankowalski", "tajneHaslo123", 25);
        User u2 = new User("annanowak", "inneHaslo456", 32);

        u1.showUser();
        u2.showUser();
    }
}
