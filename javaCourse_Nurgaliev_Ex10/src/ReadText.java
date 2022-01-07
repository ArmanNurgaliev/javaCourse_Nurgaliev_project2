import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while (sc.hasNext()) {
                String s = sc.next();
                char[] a = s.toCharArray();
                for (int i = 0; i < a.length; i++) {
                    if (a[i] >= '0' && a[i] <= '9')
                        throw new NumberException("В строке встречается цифра", (a[i]-'0'));
                }
            }
        }catch (NumberException e) {
            System.out.println(e.getMessage() + " " + e.getNum());
        }
    }

    static class NumberException extends Exception {
        private int num;

        public int getNum() {
            return num;
        }

        public NumberException(String message, int num) {
            super(message);
            this.num = num;
        }
    }
}
