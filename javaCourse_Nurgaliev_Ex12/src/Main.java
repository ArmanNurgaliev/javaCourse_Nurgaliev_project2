import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Steve", 32, 1990);
        Person p2 = new Person("John", 25, 1997);
        Person p3 = new Person("Alex", 50, 1972);
        Person p4 = new Person("Ivan", 18, 2004);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        List<Student> students = new ArrayList<>();

        Predicate<Person> isStudent = x -> (x.getAge() >= 17 && x.getAge() < 40);
        Predicate<Person> isFirstGroup = x -> x.getYearOfBirth() < 1995;
        Function<Person, Student> convert = x -> {
            String group = isFirstGroup.test(x) ? "Убин-01-22" : "Убин-02-22";
            return new Student(x.getFullname(), x.getAge(), group);
        };

        for (Person p: persons)
            if (isStudent.test(p)) students.add(convert.apply(p));

        System.out.println(students);
    }
}
