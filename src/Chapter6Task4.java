import java.util.Arrays;

public class Chapter6Task4 {

    private static final String[] BASE_ARRAY = {"Сергей", "Андрей", "Владимир"};

    public static void main(String[] args) {
        System.out.print(Arrays.toString(sortStringArray(BASE_ARRAY)));
    }

    private static String[] sortStringArray(String[] inputStringArray) {

        String[] sortedArray = inputStringArray;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < sortedArray.length-1; i++) {

                isSorted = replaceItemsInArray(i, sortedArray, isSorted);

            }
        }
        return inputStringArray;
    }

    private static boolean replaceItemsInArray(int posInStringArray, String[] sortedArray, boolean isSorted) {

        if (sortedArray[posInStringArray].charAt(0) > sortedArray[posInStringArray + 1].charAt(0)) {

            isSorted = false;
            String buf;

            buf = sortedArray[posInStringArray];
            sortedArray[posInStringArray] = sortedArray[posInStringArray+1];
            sortedArray[posInStringArray + 1] = buf;

        }
        return isSorted;
    }

}
