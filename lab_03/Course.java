import java.util.ArrayList;
import java.util.List;

public class Course {
    public static final int DEFAULT_MAX_STUDENTS = 30;
    public static final int ABSOLUTE_MAX_CAPACITY = 200;

    private static int numberOfCreatedCourses = 0;

    private String name;
    private int maxStudents;
    private final List<Student> enrolledStudents = new ArrayList<>();

    public Course(String name, int maxStudents) {
        setName(name);
        setMaxStudents(maxStudents);
        numberOfCreatedCourses++;
    }

    public Course(String name) {
        this(name, DEFAULT_MAX_STUDENTS);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nazwa kursu nie może być pusta.");
        }
        this.name = name;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents <= 0 || maxStudents > ABSOLUTE_MAX_CAPACITY) {
            throw new IllegalArgumentException("Limit studentów musi wynosić od 1 do " + ABSOLUTE_MAX_CAPACITY + ".");
        }
        if (maxStudents < enrolledStudents.size()) {
            throw new IllegalArgumentException("Nowy limit nie może być mniejszy niż liczba już zapisanych studentów.");
        }
        this.maxStudents = maxStudents;
    }

    public static int getNumberOfCreatedCourses() {
        return numberOfCreatedCourses;
    }

    public void enrollStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student nie może być null.");
        }
        if (enrolledStudents.size() >= maxStudents) {
            throw new IllegalStateException("Kurs '" + name + "' jest już pełny!");
        }
        enrolledStudents.add(student);
    }

    public void enrollStudent(String studentName, String albumNumber) {
        enrollStudent(new Student(studentName, albumNumber));
    }

    public List<Student> getEnrolledStudents() {
        return new ArrayList<>(enrolledStudents);
    }

    /*
     * UZASADNIENIE WYBORU 
     * 1. Student.name 
     *    Dane osobowe moga ulec zmianie ale musza byc chronione przed ustawieniem pustego napisu
     * 2. Student.albumNumber 
     *    bo to takie nasze id nie powinno ulegac zmianie jest tylko jedno 
     * 3. Course.name 
     *    Nazwa kursu moze zostac zmieniona, lecz nie moze byc pusta
     * 4. Course.maxStudents
     *    Limit miejsc mozna zmienic  ale setter pilnuje, by limit nie spadl ponizej liczby juz zapisanych studentow
     * 5. Course.numberOfCreatedCourses
     *    Jest to licznik systemowy zwiekszany wylacznie wewnatrz konstruktora
     */

    public static void main(String[] args) {
        Course javaCourse = new Course("Programowanie obiektowe w Javie", 15);
        Course dbCourse = new Course("Bazy danych"); 

        Student s1 = new Student("Tomasz Zieliński", "123456");
        javaCourse.enrollStudent(s1);
        javaCourse.enrollStudent("Katarzyna Wiśniewska", "654321"); 

        System.out.println("Utworzone kursy: " + Course.getNumberOfCreatedCourses());
        System.out.println("Zapisani na kurs '" + javaCourse.getName() + "': " + javaCourse.getEnrolledStudents());
    }
}
