package section_1;

public class Chapter3Task1 {

    private static final String RESULT_DESCRIPTION = "Ряд Фиббоначчи: ";
    private static final int SIZE_OF_ARRAY = 20;

    public static void main(String[] args) {

        int[] result = getFibonacciSequence(SIZE_OF_ARRAY);
        printArray(result);

    }

    private static int[] getFibonacciSequence(int sizeOfArray) {

        int[] fibonacciSequence = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            if (i < 2) {
                fibonacciSequence[i] = 1;
            } else {
                fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
            }
        }
        return fibonacciSequence;
    }

    private static void printArray(int[] incomingArray){

        System.out.println(RESULT_DESCRIPTION);
        for (int i = 0; i < incomingArray.length; i++){
            System.out.println(i + " : " + incomingArray[i]);
        }
    }
}
