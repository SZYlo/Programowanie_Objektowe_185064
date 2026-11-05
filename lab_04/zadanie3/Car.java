package zadanie3;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void showInformation() {
        System.out.println("Marka: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Liczba drzwi: " + numberOfDoors);
    }
}
