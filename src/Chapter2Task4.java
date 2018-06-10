/*
 * Сосчитать сумму ряда 1! - 2! + 3! - 4! + 5! - ... + n!
 * для заданного числа n > 0, чем шире диапазон возможных значение n,
 * тем лучше. Число n задавать в коде программы.
 */
public class Chapter2Task4 {

    public static void main(String[] args) {

        /* Число n заданное в коде программы */
        int n = 16;
        Boolean isMinus = false;
        int sum = 0;

        for (int j = 1; j <= n; j++) {
            if (isMinus) {
                sum -= getFactorial(j);
            } else {
                sum += getFactorial(j);
            }
            isMinus = !isMinus;
        }

        System.out.print("Сумма = " + sum);
    }

    private static int getFactorial(int arg) {
        int result = 1;
        for (int i = 1; i <= arg; i++) {
            result *= i;
        }
        return result;
    }
}
