public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
    Person(Person inna){
        this.name = inna.name;
    }
    public void introduceYourself(){
        System.out.println("Mam na imię: " + name);
    }
}

void main() {
    Person first = new Person("Anna");
//    Person second = first;
    Person second = new Person(first);

    second.name = "Maria";

    first.introduceYourself();
    second.introduceYourself();


    //-------------zad 6-------------
    // 1. powstał jeden obiekt

    // 2. są dwie referencje,

    // 3. ponieważ obie referencje wskazują na ten sam obiekt

    // zad 7

    // w tym przypadku powstały dwa obiekty przez co zmieniejąc wartość w second zmieniemy dane tylko w nim
}