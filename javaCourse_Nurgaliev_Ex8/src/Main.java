import person.Client;
import person.Employee;
import person.Season;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Steve", 35, "BoA");
        Employee employee = new Employee("John", 42, "Tinkoff");

        client.printFields(client.getName(), client.getAge(), client.getBankName());
        employee.printFields(employee.getName(), employee.getAge(), employee.getBankName());

        client.printColor(Season.AUTUMN);
        employee.printColor(Season.SUMMER);
    }
}
