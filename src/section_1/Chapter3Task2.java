package section_1;

public class Chapter3Task2 {

    private static final String RESULT_DESCRIPTION = "Массив: ";
    private static final int SIZE_OF_ARRAY = 100;
    private static final int FIRST_VALUE = 2;

    public static void main(String[] args) {

        int[] result = getArrayOfSimpleNumbers(SIZE_OF_ARRAY);
        printArray(result);

    }

    private static int[] getArrayOfSimpleNumbers(int sizeOfArray) {

        int[] arrayOfSimpleNumbers = new int[sizeOfArray];
        int itemOfArray = FIRST_VALUE;
        int i = 0;

        while (i < sizeOfArray) {

            if (isSimple(itemOfArray)) {
                arrayOfSimpleNumbers[i] = itemOfArray;
                i++;
            }
            itemOfArray++;
        }
        return arrayOfSimpleNumbers;
    }

    private static boolean isSimple(int verifiedNumber) {

        Boolean result = true;
        for (int i = 2; i < verifiedNumber; i++) {
            if (verifiedNumber % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static void printArray(int[] incomingArray) {

        System.out.println(RESULT_DESCRIPTION);
        for (int i = 0; i < incomingArray.length; i++){
            System.out.println(i + " : " + incomingArray[i]);
        }
    }
}
