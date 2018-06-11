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
                for (int k = 0; k < sizeOfArray; k++) {
                    for (int m = 0; m < sizeOfArray; m++) {
                        for (int n = 0; n < sizeOfArray; n++) {
                            for (int o = 0; o < sizeOfArray; o++) {
                                itemOfArray++;
                                multidimensionalArray[i][j][k][m][n][o] = itemOfArray;
                            }
                        }
                    }
                }
            }
        }

        return multidimensionalArray;
    }
}
