import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentComparator studentComparator = new StudentComparator();
        TreeMap<Student, Integer> students = new TreeMap<>(studentComparator);

        students.put(new Student("Arman", 16, 10, Lesson.valueOf("Math")), 1);
        students.put(new Student("Steve", 16, 10, Lesson.valueOf("Russian")), 2);
        students.put(new Student("Arman", 14, 10, Lesson.valueOf("Biology")), 3);
        Scanner sc = new Scanner(System.in);

        boolean stop = false;

        while (true) {
            System.out.println("Выберети действие:");
            System.out.println("1. Ввести ученика");
            System.out.println("2. Вывести всех учеников по возрастанию");
            System.out.println("3. Вывести всех учеников по убыванию");
            System.out.println("4. Удалить ученика по индексу");
            System.out.println("5. Выйти из программу");
            int action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case (1) : addStudent(students, sc);
                            break;
                case (2) : showIncrease(students);
                    break;
                case (3) : showDecrease(students);
                    break;
                case (4) : deleteStudentByIndex(students, sc);
                    break;
                case (5) : stop = true;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
            if (stop) break;
        }
    }


    private static void deleteStudentByIndex(Map<Student, Integer> students, Scanner sc) {
        System.out.println("Введите индекс");
        int index = sc.nextInt();
        sc.nextLine();
        for (Student s: students.keySet()) {
            if (students.get(s) == index) {
                students.remove(s);
                break;
            }
        }
    }

    private static void addStudent(Map<Student, Integer> students, Scanner sc) {
        System.out.println("Введите ФИО ученика");
        String name = sc.nextLine();;
        System.out.println("Введите возраст ученика");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите класс ученика");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите любимый предмет ученика (Math / Russian / Physics / Biology)");
        String lesson = sc.nextLine();;
        Student student = new Student(name, age, year, Lesson.valueOf(lesson));

        students.put(student, students.getOrDefault(student, 0)+1);
    }

    private static void showIncrease(Map<Student, Integer> students) {
        for (Student s: students.keySet())
            System.out.println(s.toString());
    }

    private static void showDecrease(TreeMap<Student, Integer> students) {
        for (Student s: students.descendingKeySet())
            System.out.println(s.toString());
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int names = o1.getName().compareTo(o2.getName());
        if (names != 0)
            return names;
        else
            return o1.getAge() - o2.getAge();
    }
}
