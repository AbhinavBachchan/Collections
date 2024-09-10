import java.lang.reflect.Type;
import java.util.Comparator;

public class Student implements Comparator {
    int grade;
    String name;
    int id;
    int age;
    public Student(int grade, String name, int id, int age) {
        this.grade = grade;
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
