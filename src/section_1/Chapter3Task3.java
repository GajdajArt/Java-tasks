package section_1;

public class Chapter3Task3 {

    private static final int SIZE_OF_ARRAY = 8;
    private static final char WHITE_ITEM = 'Б';
    private static final char BLACK_ITEM = 'Ч';

    public static void main(String[] args) {

        char[][] result = getChessArray(SIZE_OF_ARRAY);
        printArray(result);

    }

    private static char[][] getChessArray(int sizeOFArray) {

        char[][] chessArray = new char[sizeOFArray][sizeOFArray];
        boolean isBlack = true;

        for (int i = 0; i < sizeOFArray; i++) {

            for (int j = 0; j < sizeOFArray; j++) {
                if (isBlack) {
                    chessArray[i][j] = BLACK_ITEM;
                } else {
                    chessArray[i][j] = WHITE_ITEM;
                }
                isBlack = !isBlack;
            }


            if (sizeOFArray % 2 == 0) {
                isBlack = !isBlack;
            }
        }

        return chessArray;
    }

    private static void printArray(char[][] incomingArray) {

        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            for (int j = 0; j < SIZE_OF_ARRAY; j++) {
                System.out.print(incomingArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
