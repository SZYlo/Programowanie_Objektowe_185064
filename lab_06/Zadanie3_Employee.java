// Zadanie 3: Klasa abstrakcyjna Employee i rozne sposoby liczenia pensji
abstract class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void printPayslip() {
        System.out.println("Pracownik: " + name + " | Wyplata: " + calculateSalary() + " PLN");
    }
}

class Developer extends Employee {
    private double projectBonus;

    public Developer(String name, double baseSalary, double projectBonus) {
        super(name, baseSalary);
        this.projectBonus = projectBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + projectBonus;
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double baseSalary, int teamSize) {
        super(name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateSalary() {
        // Dodatek 300 PLN za kazdego czlonka zespolu
        return getBaseSalary() + (teamSize * 300.0);
    }
}

class Salesperson extends Employee {
    private double salesAmount;
    private double commissionRate;

    public Salesperson(String name, double baseSalary, double salesAmount, double commissionRate) {
        super(name, baseSalary);
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (salesAmount * commissionRate);
    }
}

public class Zadanie3_Employee {
    public static void main(String[] args) {
        Employee[] employees = {
            new Developer("Jan Kowalski", 8000, 1500),
            new Manager("Anna Nowak", 10000, 5),
            new Salesperson("Piotr Zielinski", 5000, 20000, 0.10)
        };

        for (Employee emp : employees) {
            emp.printPayslip();
        }
    }
}
