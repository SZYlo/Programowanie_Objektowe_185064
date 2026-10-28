public class Student {
    private String name;
    private final String albumNumber;

    public Student(String name, String albumNumber) {
        setName(name);
        if (albumNumber == null || !albumNumber.matches("\\d{5,6}")) {
            throw new IllegalArgumentException("Numer albumu musi składać się z 5 lub 6 cyfr.");
        }
        this.albumNumber = albumNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Imię i nazwisko studenta nie może być puste.");
        }
        this.name = name;
    }

    public String getAlbumNumber() {
        return albumNumber;
    }


    @Override
    public String toString() {
        return name + " (nr albumu: " + albumNumber + ")";
    }
}
