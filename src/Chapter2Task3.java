/*
 * Написать программу программу проверки того, что
 * заданное число Х - простое (т.е. не делится безостатка
 * ни на какие числа, кроме себя и 1).
 * Число Х задавать в коде программы.
 */
public class Chapter2Task3 {

    public static void main(String[] args) {

        /* Заданное число */
        int x = 6;

        if (isSimple(x)) {
            System.out.println("Число " + x + " - простое!");
        } else {
            System.out.println("Число " + x + " - НЕ простое!");
        }
    }

    private static boolean isSimple(int arg) {

        Boolean result = true;
        for (int i = 2; i < arg; i++) {
            if (arg % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
