public class Chapter3Task4 {

    private static final int SIZE_OF_ARRAY = 2;

    public static void main(String[] args) {

        int[][][][][][] result = getMultidimensionalArray(SIZE_OF_ARRAY);

    }

    private static int[][][][][][] getMultidimensionalArray(int sizeOfArray) {

        int[][][][][][] multidimensionalArray = new int[sizeOfArray][sizeOfArray][sizeOfArray]
                [sizeOfArray][sizeOfArray][sizeOfArray];

        int itemOfArray = 0;

        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                getFirstAttachments(i, j, multidimensionalArray, sizeOfArray, itemOfArray);
            }
        }

        return multidimensionalArray;
    }

    private static void getFirstAttachments(int i, int j, int[][][][][][] multidimensionalArray,
            int sizeOfArray, int itemOfArray){

        for (int k = 0; k < sizeOfArray; k++) {
            for (int m = 0; m < sizeOfArray; m++) {
                getSecondAttachments(i, j, k, m, multidimensionalArray, sizeOfArray, itemOfArray);
            }
        }
    }

    private static void getSecondAttachments(int i, int j, int k, int m,
            int[][][][][][] multidimensionalArray, int sizeOfArray, int itemOfArray) {

        for (int n = 0; n < sizeOfArray; n++) {
            for (int o = 0; o < sizeOfArray; o++) {
                itemOfArray++;
                multidimensionalArray[i][j][k][m][n][o] = itemOfArray;
            }
        }
    }
}
