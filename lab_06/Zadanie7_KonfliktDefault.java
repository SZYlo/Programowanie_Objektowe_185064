// Zadanie 7: Konflikt metod default w interfejsach
interface A {
    default void hello() {
        System.out.println("Hello z interfejsu A");
    }
}

interface B {
    default void hello() {
        System.out.println("Hello z interfejsu B");
    }
}

// Bez nadpisania hello() kompilator zglasza blad:
// class C inherits unrelated defaults for hello() from types A and B
class C implements A, B {
    @Override
    public void hello() {
        // Jawne wywolanie metody z interfejsu A
        A.super.hello();
    }
}

public class Zadanie7_KonfliktDefault {
    public static void main(String[] args) {
        C obj = new C();
        obj.hello();
    }
}
