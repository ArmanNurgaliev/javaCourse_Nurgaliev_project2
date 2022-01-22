import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int year;
    private Lesson lesson;

    public Student() {
    }

    public Student(String name, int age, int year, Lesson lesson) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.lesson = lesson;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", year=" + year +
                ", lesson=" + lesson +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && year == student.year && Objects.equals(name, student.name) && lesson == student.lesson;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, year, lesson);
    }
}
