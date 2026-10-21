public class Product {

    String name;
    double price;

    public Product(String name, double price) {     //----- konstruktor nic nie zwraca
        this.name = name;       //------ brak this które oznacza referencję do bieżącego obiektu
        this.price = price;
    }

    public void show() {
        System.out.println(name + ": " + price);
    }
}

void main() {
    Product product = new Product("Monitor", 1200);

    product.show();
}