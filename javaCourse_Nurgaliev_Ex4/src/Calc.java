import java.util.Scanner;

public class Calc {
    public static final String ADD = "+";
    public static final String SUB = "-";
    public static final String MULT = "*";
    public static final String DIV = "/";
    public static final String FACT = "!";
    public static final String POW = "^";
    public static final String COMP = "?";
    public static double[] num = new double[2];
    public static String el[] = new String[3];
    public static boolean afterComp = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите действие (1, 2 или 3)");
        int action2 = -1;
        int action = -1;

        boolean firstAction = true;
        while (true) {
            printFirstMenu();
            String example = "";
            if (!afterComp) {
                action = sc.nextInt();
                sc.nextLine();
            }
            else
                action = 1;

            if (action == 1) {
                firstAction = false;
                System.out.println("Введите пример через пробел");
                example = sc.nextLine();
                readInput(example);
                calculate();
            }
            else if (action == 2) {
                if (firstAction) {
                    System.out.println("Недоступно!");
                    break;
                }
                while (action2 != 0) {
                    printSecondMenu();

                    action2 = sc.nextInt();
                    if (action2 != 0) {
                        System.out.println("Введте число");
                        if (action2 != 5) {
                            num[1] = sc.nextInt();
                            sc.nextLine();
                        }
                        calculateAgain(action2);
                    }
                }
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

    private static void readInput(String example) {
        el = example.split(" ");
        num[0] = Double.parseDouble(el[0]);
        if (el.length > 2) {
            num[1] = Double.parseDouble(el[2]);
        }
    }

    private static void calculateAgain(int a) {
        el[1] = a == 1 ? "+" :
                a == 2 ? "-" :
                a == 3 ? "*" :
                a == 4 ? "/" :
                a == 5 ? "!" :
                a == 6 ? "^" : "?";
        calculate();
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


    public static void calculate() {
        if (el[1].equals(ADD))
            calculateSum();
        else if (el[1].equals(SUB))
            calculateSub();
        else if (el[1].equals(MULT))
            calculateMult();
        else if (el[1].equals(DIV))
            calculateDiv();
        else if (el[1].equals(FACT))
            calculateFact();
        else if (el[1].equals(POW))
            calculatePow();
        else if (el[1].equals(COMP))
            calculateComp();
    }

    private static void calculatePow() {
        System.out.println("\"^\" " + num[0] + " ^ " + num[1] + " = " + Math.pow(num[0], num[1]));
        num[0] = Math.pow(num[0], num[1]);
    }

    private static void calculateDiv() {
        System.out.println("\"/\" " + num[0] + " / " + num[1] + " = " + (num[0] / num[1]));
        num[0] = (num[0] / num[1]);
    }

    private static void calculateMult() {
        System.out.println("\"*\" " + num[0] + " * " + num[1] + " = " + (num[0] * num[1]));
        num[0] = (num[0] * num[1]);
    }

    private static void calculateSub() {
        System.out.println("\"-\" " + num[0] + " - " + num[1] + " = " + (num[0] - num[1]));
        num[0] = (num[0] - num[1]);
    }

    private static void calculateSum() {
        System.out.println("\"+\" " + num[0] + " + " + num[1] + " = " + (num[0] + num[1]));
        num[0] = (num[0] + num[1]);
    }

    private static void calculateComp() {
        System.out.print("\"?\" " + num[0] + " ? " + num[1] + " = ");
        if (num[0] > num[1]) System.out.println(num[0] + " > " + num[1]);
        else if (num[0] < num[1]) System.out.println(num[0] + " < " + num[1]);
        else System.out.println(num[0] + " = " + num[1]);
        afterComp = true;
    }

    public static void calculateFact() {
        int ans = 1;
        for (int i = 2; i <= num[0]; i++) {
            ans *= i;
        }
        System.out.println("\"!\" " + num[0] + " ! = " + ans);

        num[0] = ans;
    }
}
