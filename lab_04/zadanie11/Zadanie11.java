package zadanie11;

class Person {
    private String name;
    public Person(String name) { this.name = name; }
    public String getName() { return name; }
    
    public void showInformation() {
        System.out.println("Person: " + this.name);
    }
}

class Student extends Person {
    private int albumNumber;
    
    public Student(String name, int albumNumber) {
        super(name); // Naprawa 1
        this.albumNumber = albumNumber;
    }
    
    @Override // Naprawa 4
    public void showInformation() { // Naprawa 3 iterowka w nazwie
        System.out.println("Name: " + getName() + ", Album: " + albumNumber); // Naprawa 2 getter dla private
    }
}
