package section_1;

public class Chapter3Task5 {

    private static final int SIZE_OF_ARRAY = 10;


    public static void main(String[] args) {

        int[][] result = getPascalsTriangle(SIZE_OF_ARRAY);
        printArray(result);

    }

    private static int[][] getPascalsTriangle(int sizeOFArray) {

        int height = sizeOFArray;
        int width = (sizeOFArray * 2) - 1;
        int counterForTriangle = 1;

        int[][] pascalsTriangle = new int[height][width];


        for (int i = 0; i < height; i++) {
            int counterForLine = 1;
            for (int j = 0; j < width; j++) {
                counterForLine = fillTheStringOfArray(pascalsTriangle, i, j, counterForTriangle, counterForLine);
            }
            counterForTriangle++;
        }

        return pascalsTriangle;
    }

    private static int fillTheStringOfArray(int[][] triangle, int x, int y, int counterForTriangle, int counterForLine) {

        int centerOfTriangle = triangle.length - 1;
        int currentCounter = counterForLine;

        if ((y <= centerOfTriangle - counterForTriangle) || (y >= centerOfTriangle + counterForTriangle)) {
            triangle[x][y] = 0;
        } else if (y < centerOfTriangle) {
            triangle[x][y] = currentCounter;
            currentCounter++;
        } else if (y > centerOfTriangle) {
            currentCounter--;
            triangle[x][y] = currentCounter;
        } else {
            triangle[x][y] = counterForTriangle;
        }

        return currentCounter;
    }

    private static void printArray(int[][] incomingArray) {

        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            for (int j = 0; j < (SIZE_OF_ARRAY * 2) - 1; j++) {
                System.out.print(incomingArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
