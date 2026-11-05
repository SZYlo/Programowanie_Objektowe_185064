package zadanie7;

class Device {
    protected String manufacturer;
    public Device(String manufacturer) { this.manufacturer = manufacturer; }
}

class Computer extends Device {
    protected int ramGb;
    public Computer(String manufacturer, int ramGb) {
        super(manufacturer);
        this.ramGb = ramGb;
    }
}

class Laptop extends Computer {
    private int batteryCapacityWh;
    public Laptop(String manufacturer, int ramGb, int batteryCapacityWh) {
        super(manufacturer, ramGb);
        this.batteryCapacityWh = batteryCapacityWh;
    }
    
    public void showSpecs() {
        System.out.println("Producent: " + manufacturer + ", RAM: " + ramGb + "GB, Bateria: " + batteryCapacityWh + "Wh");
    }
}
