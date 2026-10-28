public class InitializationDemo {
    private static String staticField = initStaticField();

    private String instanceField = initInstanceField();

    static {
        System.out.println("2. Blok statyczny (wykonywany raz przy ładowaniu klasy)");
    }

    {
        System.out.println("4. Blok instancyjny (wykonywany przed konstruktorem dla każdego obiektu)");
    }


    public InitializationDemo() {
        System.out.println("5. Konstruktor (wykonywany na końcu tworzenia obiektu)");
    }

    private static String initStaticField() {
        System.out.println("1. Inicjalizacja pola statycznego (wykonywana raz przy ładowaniu klasy)");
        return "wartość statyczna";
    }

    private String initInstanceField() {
        System.out.println("3. Inicjalizacja pola instancji (wykonywana dla każdego obiektu)");
        return "wartość instancyjna";
    }

    /*
     * PRZEWIDYWANA KOLEJNOSC KOMUNIKATOW PRZED URUCHOMIENIEM :
     * --- ladowanie klasy (tylko raz) ---
     * 1. Inicjalizacja pola statycznego
     * 2. Blok statyczny
     * --- Tworzenie pierwszego obiektu ---
     * 3. Inicjalizacja pola instancji
     * 4. Blok instancyjny
     * 5. Konstruktor
     * --- Tworzenie drugiego obiektu ---
     * 3. Inicjalizacja pola instancji
     * 4. Blok instancyjny
     * 5. Konstruktor
     */

    public static void main(String[] args) {
        System.out.println("--- Tworzenie pierwszego obiektu ---");
        InitializationDemo obj1 = new InitializationDemo();

        System.out.println("--- Tworzenie drugiego obiektu ---");
        InitializationDemo obj2 = new InitializationDemo();
    }
}
