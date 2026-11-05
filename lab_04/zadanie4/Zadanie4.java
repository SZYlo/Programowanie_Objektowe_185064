package zadanie4;

class A { public A() { System.out.println("Konstruktor A"); } }
class B extends A { public B() { System.out.println("Konstruktor B"); } }
class C extends B { public C() { System.out.println("Konstruktor C"); } }

public class Zadanie4 {
    public static void main(String[] args) {
        new C(); 
    }
}
