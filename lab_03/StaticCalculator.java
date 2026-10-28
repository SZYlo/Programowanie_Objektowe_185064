public class StaticCalculator {
    private static int numberOfOperations = 0;


    private StaticCalculator() {}

    // Przeciążone metody add(...) z Zadania 8:
    public static int add(int a, int b) {
        numberOfOperations++;
        return a + b;
    }

    public static int add(int a, int b, int c) {
        numberOfOperations++;
        return a + b + c;
    }

    public static double add(double a, double b) {
        numberOfOperations++;
        return a + b;
    }

    public static int subtract(int a, int b) {
        numberOfOperations++;
        return a - b;
    }

    public static int multiply(int a, int b) {
        numberOfOperations++;
        return a * b;
    }

    public static int getNumberOfOperations() {
        return numberOfOperations;
    }

    public static void main(String[] args) {

        System.out.println("add(2, 3) = " + StaticCalculator.add(2, 3));
        System.out.println("add(2, 3, 4) = " + StaticCalculator.add(2, 3, 4));
        System.out.println("add(2.5, 3.7) = " + StaticCalculator.add(2.5, 3.7));
        System.out.println("subtract(10, 4) = " + StaticCalculator.subtract(10, 4));
        System.out.println("multiply(5, 6) = " + StaticCalculator.multiply(5, 6));

        System.out.println("Liczba wykonanych operacji: " + StaticCalculator.getNumberOfOperations());
    }
}
