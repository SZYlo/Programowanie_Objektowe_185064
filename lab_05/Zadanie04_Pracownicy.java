//-----------------------Zad 4-----------------------

class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Developer extends Employee {
    double bonus;

    public Developer(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Tester extends Employee {
    int bugsFound;

    public Tester(String name, double baseSalary, int bugsFound) {
        super(name, baseSalary);
        this.bugsFound = bugsFound;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bugsFound * 50;
    }
}

class Manager extends Employee {
    double managementBonus;

    public Manager(String name, double baseSalary, double managementBonus) {
        super(name, baseSalary);
        this.managementBonus = managementBonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + managementBonus;
    }
}

// Nowa klasa nie wymaga zmiany petli w main
class Administrator extends Employee {
    double systemAllowance;

    public Administrator(String name, double baseSalary, double systemAllowance) {
        super(name, baseSalary);
        this.systemAllowance = systemAllowance;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + systemAllowance;
    }
}

public class Zadanie04_Pracownicy {
    public static void main(String[] args) {
        Employee[] employees = {
            new Developer("Jan", 8000, 2000),
            new Tester("Anna", 6000, 10),
            new Manager("Piotr", 10000, 3000),
            new Administrator("Kasia", 7000, 1200)
        };

        for (Employee employee : employees) {
            System.out.println(employee.name + " zarabia: " + employee.calculateSalary());
        }
    }
}
