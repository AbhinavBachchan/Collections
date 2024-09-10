import java.util.Comparator;

public class StudentComparators {
    public static Comparator<Student> byName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> byAge() {
        return Comparator.comparingInt(Student::getAge);
    }

    public static Comparator<Student> byGrade() {
        return Comparator.comparingDouble(Student::getGrade);
    }

    public static Comparator<Student> byId() {
        return Comparator.comparingDouble(Student::getId);
    }
}
