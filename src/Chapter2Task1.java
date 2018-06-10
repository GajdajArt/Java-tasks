/**
 * Написать программу которая находит наибольший общий
 * делитель двух целых положительных чисел.
 **/
public class Chapter2Task1 {

    public static void main(String[] args) {

        /**Два целых положительных числа*/
        int arg1 = 0;
        int arg2 = 12;

        if (arg1 > 0 && arg2 > 0) {
            int divider = getDivider(arg1, arg2);
            System.out.print("Наименьший общий делитель = " + divider);
        } else {
            System.out.print("Числа должны быть больше нуля");
        }
    }

    private static int getDivider(int i1, int i2) {

        int result = 0;

        int minArg;
        if (i1 <= i2) {
            minArg = i1;
        } else {
            minArg = i2;
        }

        for (int j = 1; j <= minArg; j++) {
            if ((i1 % j == 0) && (i2 % j == 0)) {
                result = j;
            }
        }

        return result;
    }
}
