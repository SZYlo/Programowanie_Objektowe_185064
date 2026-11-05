package zadanie5;

class Animal {
    public void makeSound() { System.out.println("Dzwiek zwierzęcia"); }
}

class Dog extends Animal {
    @Override
    public void makeSound() { System.out.println("Hau hau!"); }
}

class Cat extends Animal {
    @Override
    public void makeSound() { System.out.println("Miau!"); }
}

class Cow extends Animal {
    @Override
    public void makeSound() { System.out.println("Muu!"); }
}
