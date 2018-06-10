/*
 * Посчитать, сколько шестизначних чисел имеют
 * равную сумму трех первых и трех последних цифр.
 */
public class Chapter2Task5 {

    private static final int MIN_NUMBER = 100000;
    private static final int MAX_NUMBER = 999999;

    public static void main(String[] args) {

        int counter = 0;
        int leftPart;
        int rightPart;

        for (int i = MIN_NUMBER; i <= MAX_NUMBER; i++) {
            leftPart = getLeftPart(i);
            rightPart = getRightPart(i);

            if (getSumOfDigits(leftPart) == getSumOfDigits(rightPart)){
                counter++;
            }
        }

        System.out.print("Количество таких чисел = " + counter);
    }

    private static int getSumOfDigits(int arg){

        int result = 0;
        int mod;

        while (arg > 0) {
            mod = arg % 10;
            arg = arg / 10;
            result += mod;
        }
        return result;
    }

    private static int getLeftPart(int arg){
        return arg / 1000;
    }

    private static int getRightPart(int arg){
        return arg % 1000;
    }
}
