public class Product {
    public static final int MAX_PRODUCTS = 3;
    private static int numberOfProducts = 0;

    private String name;
    private double price;

    public Product(String name, double price) {
        if (numberOfProducts >= MAX_PRODUCTS) {
            throw new IllegalStateException("Nie można utworzyć produktu '" + name + "'. Osiągnięto limit: " + MAX_PRODUCTS);
        }
        this.name = name;
        this.price = price;
        numberOfProducts++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }

    /*
     * ODPOWIEDZI NA PYTANIA Z ZADANIA 6:
     * 1. 
     *    Poniewaz limit dotyczy calej klasy Product a nie pojedynczego egzemplarza.
     *    Nie ma sensu duplikowac tej samej wartosci w kazdym obiekcie.
     * 2. 
     *    Poniewaz jest to stala konfiguracyjna, ktorej wartosc nie powinna byc modyfikowana w trakcie dzialania programu.
     *
     *  3. Dlaczego numberOfProducts nie powinno byc final?
     *    Poniewaz jest to licznik, ktorego wartosc zmienia sie przy kazdym utworzeniu nowego obiektu.
     */

    public static void main(String[] args) {
        try {
            Product p1 = new Product("Laptop", 3500.0);
            Product p2 = new Product("Myszka", 120.0);
            Product p3 = new Product("Klawiatura", 250.0);
            System.out.println("Utworzono produktów: " + Product.getNumberOfProducts());

            // Próba przekroczenia limitu MAX_PRODUCTS:
            Product p4 = new Product("Monitor", 1100.0);
        } catch (IllegalStateException e) {
            System.out.println("Złapano wyjątek: " + e.getMessage());
        }
    }
}
