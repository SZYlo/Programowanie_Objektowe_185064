public class Car {
    String brand;
    String model;
    int productionYear;
    double mileage;

    public Car(String brand, String model, int productionYear, double mileage) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    Car(Car other){
        this.brand = other.brand;
        this.model = other.model;
        this.productionYear = other.productionYear;
        this.mileage = other.mileage;
    }


    public Car(String brand, String model) {
        this(brand, model, 0, 0);
        
    }

    public Car(String brand, String model, double mileage) {
        this(brand, model, 0, mileage);
    }
    
    public void drive(double distance){
        if (distance>0) this.mileage += distance;
    }
    
    public void showInformation(){
        System.out.println(brand + " " + model + " " + productionYear + " " + mileage);
    }
}

void main() {
    Car s1 = new Car("Bmw", "e32", 1997, 315000 );
    Car s2 = new Car("Toyota", "markII", 32000);
    Car s3 = new Car("Nissan", "Stegea");

    //-------------zad 9-------------
    //wyskoczy błąd

    Car car = null;
    if (car != null) {
        car.showInformation();
    }

    Car original = new Car("Bmw", "e24", 1977, 120000);
    Car copy = new Car(original);


    s2.drive(200);
    s1.showInformation();
    s2.showInformation();
    s3.showInformation();


    System.out.println();

    original.showInformation();
    copy.showInformation();


    System.out.println();


    copy.drive(30000);
    original.showInformation();
    copy.showInformation();


    //-------------zad 5-------------
    //oryginał pozostaje bez zmian a w kopii zostaje przypisana nowa wartość

}