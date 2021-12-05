import java.util.Scanner;

public class Calc {
    public static final String ADD = "+";
    public static final String SUB = "-";
    public static final String MULT = "*";
    public static final String DIV = "/";
    public static final String FACT = "!";
    public static final String POW = "^";
    public static final String COMP = "?";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите действие (1, 2 или 3)");
        int action2 = -1;
        int action = -1;
        String elem[] = new String[3];

        boolean firstAction = true;
        while (true) {
            printFirstMenu();
            String example = "";
            action = sc.nextInt();
            sc.nextLine();

            if (action == 1) {
                firstAction = false;
                System.out.println("Введите пример через пробел");
                example = sc.nextLine();
                elem = example.split(" ");
                calculate(elem);
            }
            else if (action == 2) {
                if (firstAction) {
                    System.out.println("Недоступно!");
                    break;
                }

                printSecondMenu();

                action2 = sc.nextInt();
                if (action2 != 0)
                    calculateAgain(elem, action2);
            }
            else if (action == 3){
                break;
            }
            else {
                System.out.println("Такого действия нет!");
                break;
            }
        }
    }

    private static void calculateAgain(String[] el, int a) {
        el[1] = a == 1 ? "+" :
                a == 2 ? "-" :
                a == 3 ? "*" :
                a == 4 ? "/" :
                a == 5 ? "!" :
                a == 6 ? "^" : "?";
        calculate(el);
    }

    private static void printSecondMenu() {
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Факториал");
        System.out.println("6. Возведение в степень");
        System.out.println("7. Сравнение");
        System.out.println("0. Назад");
    }

    private static void printFirstMenu() {
        System.out.println("1. Ввести пример");
        System.out.println("2. Продолжить работать с предыдущим ответом");
        System.out.println("3. Выход");
    }


    public static void calculate(String[] el) {
        double[] num = new double[2];
        num[0] = Double.parseDouble(el[0]);
        if (el.length > 2) {
            num[1] = Double.parseDouble(el[2]);
        }
        if (el[1].equals(ADD))
            calculateSum(num);
        else if (el[1].equals(SUB))
            calculateSub(num);
        else if (el[1].equals(MULT))
            calculateMult(num);
        else if (el[1].equals(DIV))
            calculateDiv(num);
        else if (el[1].equals(FACT))
            calculateFact(num[0]);
        else if (el[1].equals(POW))
            calculatePow(num);
        else if (el[1].equals(COMP))
            calculateComp(num);
    }

    private static void calculatePow(double[] num) {
        System.out.println("\"^\" " + num[0] + " ^ " + num[1] + " = " + Math.pow(num[0], num[1]));
    }

    private static void calculateDiv(double[] num) {
        System.out.println("\"/\" " + num[0] + " / " + num[1] + " = " + (num[0] / num[1]));
    }

    private static void calculateMult(double[] num) {
        System.out.println("\"*\" " + num[0] + " * " + num[1] + " = " + (num[0] * num[1]));
    }

    private static void calculateSub(double[] num) {
        System.out.println("\"-\" " + num[0] + " - " + num[1] + " = " + (num[0] - num[1]));
    }

    private static void calculateSum(double[] num) {
        System.out.println("\"+\" " + num[0] + " + " + num[1] + " = " + (num[0] + num[1]));
    }

    private static void calculateComp(double[] num) {
        System.out.print("\"?\" " + num[0] + " ? " + num[1] + " = ");
        if (num[0] > num[1]) System.out.println(num[0] + " > " + num[1]);
        else if (num[0] < num[1]) System.out.println(num[0] + " < " + num[1]);
        else System.out.println(num[0] + " = " + num[1]);
    }

    public static void calculateFact(double x) {
        int ans = 1;
        for (int i = 2; i <= x; i++) {
            ans *= i;
        }
        System.out.println("\"!\" " + x + " ! = " + ans);
    }
}
