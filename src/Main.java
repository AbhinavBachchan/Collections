import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(70,"Abhinav",1,22));
        list.add(new Student(80,"Palak",2,25));
        list.add(new Student(50,"Surya",3,24));
        list.add(new Student(100,"Suraj",5,20));
        list.add(new Student(60,"Aryan",4,21));

        for(Student s:list){
            System.out.println(s.toString());
        }
        // Sort by name
        Collections.sort(list, StudentComparators.byName());
        System.out.println("Sorted by Name: " + list);

        // Sort by age
        Collections.sort(list, StudentComparators.byAge());
        System.out.println("Sorted by Age: " + list);

        // Sort by GPA
        Collections.sort(list, StudentComparators.byGrade());
        System.out.println("Sorted by Grade: " + list);

        // Sort by id
        Collections.sort(list, StudentComparators.byId());
        System.out.println("Sorted by Id: " + list);
    }

}