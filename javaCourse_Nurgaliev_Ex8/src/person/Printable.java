package person;

public interface Printable {
    default void printFields(String name, int age, String bankName) {
        System.out.printf("Name: %s, age %d, bank %s\n", name, age, bankName);
    }
}
