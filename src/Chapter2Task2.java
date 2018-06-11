/*
 * Написать программу которая находит сумму цифр
 * произвольного целого числа.
 */
public class Chapter2Task2 {

    private static final int ARBITRARY_INTEGER = 741;

    private static final String INCOMING_NUMBER_DESCRIPTION = "Входящее число = ";
    private static final String SUM_OF_DIGITS_DESCRIPTION = "Сумма цифр = ";

    public static void main(String[] args) {

        int arg = ARBITRARY_INTEGER;
        System.out.println(INCOMING_NUMBER_DESCRIPTION + arg);

        int sum = 0;
        int mod;

        while (arg > 0) {
            mod = arg % 10;
            arg = arg / 10;
            sum += mod;
        }

        System.out.println(SUM_OF_DIGITS_DESCRIPTION + sum);
    }
}
