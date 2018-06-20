package section_1;

import java.util.Scanner;

public class Chapter9Task3 {

    private static final int SIZE = 3;

    public static void main(String[] args) {
        print(getIntArray());
    }

    private static int[] getIntArray() {

        Scanner in = new Scanner(System.in);
        int[] numArray = new int[SIZE];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = in.nextInt();
        }
        return numArray;
    }

    private static void print(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
