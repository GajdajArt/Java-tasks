/**
 * Написать программу которая находит наибольший общий
 * делитель двух целых положительных чисел.
 **/
public class Chapter2Task1 {

    private static final int ARGUMENT_A = 0;
    private static final int ARGUMENT_B = 12;

    private static final String POSITIVE_RESULT_DESCRIPTION = "Наименьший общий делитель = ";
    private static final String NEGATIVE_RESULT_DESCRIPTION = "Числа должны быть больше нуля";

    public static void main(String[] args) {

        if ((ARGUMENT_A > 0) && (ARGUMENT_B > 0)) {
            int divider = getGreatestCommonDivisor(ARGUMENT_A, ARGUMENT_B);
            System.out.print(POSITIVE_RESULT_DESCRIPTION + divider);
        } else {
            System.out.print(NEGATIVE_RESULT_DESCRIPTION);
        }
    }

    private static int getGreatestCommonDivisor(int argumentA, int argumentB) {

        int result = 0;

        int minimum;
        if (argumentA <= argumentB) {
            minimum = argumentA;
        } else {
            minimum = argumentB;
        }

        for (int i = 1; i <= minimum; i++) {
            if ((argumentA % i == 0) && (argumentB % i == 0)) {
                result = i;
            }
        }

        return result;
    }
}
