public class Person {
    private String fullname;
    private int age;
    private int yearOfBirth;

    public Person() {
    }

    public Person(String fullname, int age, int yearOfBirth) {
        this.fullname = fullname;
        this.age = age;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
