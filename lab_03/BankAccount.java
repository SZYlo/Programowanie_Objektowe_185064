public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        if (owner == null || owner.trim().isEmpty()) {
            throw new IllegalArgumentException("Właściciel konta nie może być pusty.");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Saldo początkowe nie może być ujemne.");
        }
        this.owner = owner;
        this.balance = initialBalance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // Brak metody setBalance(...) zgodnie z poleceniem!

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Wpłacono: " + amount + " PLN. Nowe saldo: " + balance + " PLN.");
        } else {
            System.out.println("Błąd wpłaty: Kwota musi być dodatnia.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Błąd wypłaty: Kwota musi być dodatnia.");
        } else if (amount > balance) {
            System.out.println("Błąd wypłaty: Brak wystarczających środków na koncie.");
        } else {
            balance -= amount;
            System.out.println("Wypłacono: " + amount + " PLN. Nowe saldo: " + balance + " PLN.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Anna Nowak", 1000.0);
        System.out.println("Konto właściciela: " + account.getOwner() + ", saldo: " + account.getBalance());
        account.deposit(500.0);
        account.withdraw(300.0);
        account.withdraw(2000.0); 
    }
}
