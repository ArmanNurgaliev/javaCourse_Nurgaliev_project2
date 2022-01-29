public class Student {
    private String fullname;
    private int age;
    private String group;

    public Student() {
    }

    public Student(String fullname, int age, String group) {
        this.fullname = fullname;
        this.age = age;
        this.group = group;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Name=" + fullname + "," +
                " age=" + age + "," +
                " group=" + group;
    }
}
