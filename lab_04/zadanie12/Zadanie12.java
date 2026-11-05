package zadanie12;

class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
    public String getName() { return name; }
    
    public void work() { System.out.println(name + " pracuje."); }
    
    @Override
    public String toString() { return "Pracownik: " + name; }
}

class Developer extends Employee {
    private String language;
    public Developer(String name, String language) {
        super(name);
        this.language = language;
    }
    
    @Override
    public void work() { System.out.println(getName() + " pisze kod w " + language); }
}

class Manager extends Employee {
    public Manager(String name) { super(name); }
    
    @Override
    public void work() {
        super.work();
        System.out.println(getName() + " zarządza zespołem.");
    }
}

class Tester extends Employee {
    public Tester(String name) { super(name); }
    
    @Override
    public void work() { System.out.println(getName() + " testuje oprogramowanie."); }
}
