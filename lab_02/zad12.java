
class Klient {
    String imie;
    int wiek;

    Klient(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
}

class Produkt {
    String nazwa;
    double cena;

    Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
}

class Zamowienie {
    Produkt produkt;
    int ilosc;

    Zamowienie(Produkt produkt, int ilosc) {
        this.produkt = produkt;
        this.ilosc = ilosc;
    }

    void dodajProdukt(Klient klient) {
        System.out.println(
                klient.imie + " kupuje: " + produkt.nazwa
                        + ", ilość: " + ilosc
                        + ", cena: " + (produkt.cena * ilosc) + " zł"
        );
    }
}

public class zad12 {
    public static void main(String[] args) {
        Klient k1 = new Klient("Kamil", 28);
        Klient k2 = new Klient("Marek", 13);
        Klient k3 = new Klient("Karolina", 8);

        Produkt p1 = new Produkt("Laptop", 3500);
        Produkt p2 = new Produkt("Mysz komputerowa", 80);

        Zamowienie z1 = new Zamowienie(p1, 1);
        Zamowienie z2 = new Zamowienie(p2, 2);
        Zamowienie z3 = new Zamowienie(p2, 1);

        z1.dodajProdukt(k1);
        z2.dodajProdukt(k1);
        z1.dodajProdukt(k2);
    }
}
