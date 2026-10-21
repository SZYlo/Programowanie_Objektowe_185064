public class Counter {
    int value;

    public Counter(int value) {
        this.value = value;
    }

    public int increaseOther(Counter other){
        return other.value += 1;
    }
}

void main() {
    Counter c1 = new Counter(12);
    Counter c2 = new Counter(99);
    c1.increaseOther(c2);
    c2.increaseOther(c2);
    System.out.println(c1.value);
    System.out.println(c2.value);
}

//--------  ponieważ przekazujemy jedynie adres (referencje), a nie cały obiekt