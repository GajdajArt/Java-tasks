package chapter_8_task_1;

import java.util.Arrays;

public class Try {

    private static final int[] INPUT_ARRAY = {2, 5, 3, 1, 4};

    public static void main(String[] args) {

        IntegerArray intArray = new IntegerArray(INPUT_ARRAY);
        System.out.println(Arrays.toString(intArray.inverse()));

        IntegerArray.Averaging averaging = intArray.getAveraging();

        System.out.println(averaging.getAverage());
        System.out.println(averaging.getMedian());
    }
}
