/*
 * Написать программу которая находит сумму цифр
 * произвольного целого числа.
 */
public class Chapter2Task2 {

    public static void main(String[] args) {

        /**Произвольное целое число*/
        int arg = 741;
        System.out.println("Входящее число = " + arg);

        int sum = 0;
        int mod;

        while (arg > 0) {
            mod = arg % 10;
            arg = arg / 10;
            sum += mod;
        }

        System.out.println("Сумма цифр = " + sum);
    }
}
