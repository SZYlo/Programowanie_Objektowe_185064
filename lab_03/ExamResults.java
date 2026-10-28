import java.util.Arrays;

public class ExamResults {
    private int[] points;

    // Poprawiona wersja z kopią defensywną w konstruktorze:
    public ExamResults(int[] points) {
        if (points == null) {
            this.points = new int[0];
        } else {
            this.points = Arrays.copyOf(points, points.length);
        }
    }

    // Poprawiona wersja z kopią defensywną w getterze:
    public int[] getPoints() {
        return Arrays.copyOf(points, points.length);
    }

    /*
     * WNIOSKI Z TESTU BEZ KOPII DEFENSYWNEJ:
     * 1. Bez kopiowania w konstruktorze zmiana oryginalnej tablicy po utworzeniu
     *    obiektu WPlYWA na stan wewnetrzny obiektu
     * 2. Bez kopiowania w getterze zmiana tablicy otrzymanej z getPoints() rowniez WPlYWA
     *    na wewnetrzna tablice obiektu, lamiac hermetyzacje.
     */

    public static void main(String[] args) {
        int[] original = {80, 90, 100};
        ExamResults results = new ExamResults(original);

        // 1. Próba zmiany oryginalnej tablicy
        original[0] = 0;
        System.out.println("Po zmianie tablicy zewnętrznej: " + Arrays.toString(results.getPoints()));

        // 2. Próba zmiany tablicy pobranej z getPoints()
        int[] fromGetter = results.getPoints();
        fromGetter[1] = 0;
        System.out.println("Po zmianie tablicy z getPoints(): " + Arrays.toString(results.getPoints()));
    }
}
