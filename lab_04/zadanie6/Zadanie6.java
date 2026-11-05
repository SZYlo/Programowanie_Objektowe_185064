package zadanie6;

class Employee {
    protected String name;
    public Employee(String name) { this.name = name; }
    public void showInformation() {
        System.out.println("Pracownik: " + name);
    }
}

class Manager extends Employee {
    private String department;
    public Manager(String name, String department) {
        super(name);
        this.department = department;
    }
    
    @Override
    public void showInformation() {
        super.showInformation(); 
        System.out.println("Zarządzany dział: " + department);
    }
}
