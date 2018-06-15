package chapter_8_task_1;

public class IntegerArray implements Inversion {

    private int[] array;

    public IntegerArray(int[] array) {
        this.array = sort(array);
    }

    private int[] sort(int[] array) {

        int[] sortedArray = array;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                isSorted = replaceItemsInArray(i, sortedArray, isSorted);
            }
        }
        return sortedArray;
    }

    private static boolean replaceItemsInArray(int posInArray, int[] sortedArray, boolean isSorted) {

        if (sortedArray[posInArray] > sortedArray[posInArray + 1]) {

            isSorted = false;
            int buf = sortedArray[posInArray];
            sortedArray[posInArray] = sortedArray[posInArray + 1];
            sortedArray[posInArray + 1] = buf;
        }
        return isSorted;
    }

    @Override
    public int[] inverse() {

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[(array.length - 1) - i] = array[i];
        }
        return result;
    }



    public Averaging getAveraging() {
        return new InnerClass();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = sort(array);
    }

    public class InnerClass implements  Averaging {

        @Override
        public int getMedian() {
            return array[(array.length  - 1) / 2];
        }

        @Override
        public int getAverage() {

            int result = 0;
            for (int i = 0; i < array.length; i++) {
                result += array[i];
            }
            return result / array.length;
        }
    }

    interface Averaging {

        int getMedian();
        int getAverage();
    }
}
