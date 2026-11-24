// Zadanie 12: Strategia platnosci przez kompozycje
interface PaymentMethod {
    void pay(double amount);
}

class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Platnosc karta na kwote: " + amount + " PLN");
    }
}

class BlikPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Platnosc BLIK na kwote: " + amount + " PLN");
    }
}

class TransferPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Platnosc przelewem na kwote: " + amount + " PLN");
    }
}

class OrderService {
    private PaymentMethod paymentMethod;

    public OrderService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        paymentMethod.pay(amount);
    }
}

public class Zadanie12_Platnosci {
    public static void main(String[] args) {
        OrderService order1 = new OrderService(new CardPayment());
        order1.checkout(150.0);

        OrderService order2 = new OrderService(new BlikPayment());
        order2.checkout(89.99);

        OrderService order3 = new OrderService(new TransferPayment());
        order3.checkout(420.50);
    }
}
