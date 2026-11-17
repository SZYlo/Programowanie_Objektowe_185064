//-----------------------Zad 12-----------------------

class Payment {
    public void pay(double amount) {
        System.out.println("Platnosc: " + amount);
    }
}

class CardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Platnosc karta: " + amount);
    }
}

class BlikPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Platnosc BLIK: " + amount);
    }
}

class TransferPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Przelew: " + amount);
    }
}

public class Zadanie12_Platnosci {
    public static void main(String[] args) {
        Payment[] payments = {
            new CardPayment(),
            new BlikPayment(),
            new TransferPayment()
        };

        for (Payment payment : payments) {
            payment.pay(99.99);
        }
    }
}
