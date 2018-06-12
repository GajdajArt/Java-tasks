package chapter_4_task_3;

public class Matrix {

    private int[][] matrixArray;


    public Matrix(int sizeX, int sizeY) {
        this.matrixArray = new int[sizeX][sizeY];

    }

    public void add(Matrix matrixForAdding) {

        int[][] matrixForAddingArray = matrixForAdding.getMatrixArray();

        if (matrixArray[0].length == matrixForAddingArray[0].length &&
                matrixArray.length == matrixForAddingArray.length) {

            addNewMatrix(matrixForAddingArray);
        }
    }

    private void addNewMatrix(int[][] matrixForAddingArray) {
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[0].length; j++) {
                this.matrixArray[i][j] += matrixForAddingArray[i][j];
            }
        }
    }

    public void multiplyOnFactor(int factor) {
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[0].length; j++) {
                this.matrixArray[i][j] *= factor;
            }
        }
    }

    public void multiplyOnMatrix(Matrix matrixForMultiply) {

        int[][] matrixForMultiplyArray = matrixForMultiply.getMatrixArray();

        if (matrixArray[0].length == matrixForMultiplyArray.length) {
            multiplyOnMatrix(matrixForMultiplyArray);
        }
    }

    private void multiplyOnMatrix(int[][] matrixForMultiplyArray) {

        int sizeOfRows = matrixArray.length;
        int sizeOfColumns = matrixForMultiplyArray[0].length;
        int[][] resultMatrixArray = new int[sizeOfRows][sizeOfColumns];

        for (int i = 0; i < sizeOfRows; i++) {
            for (int j = 0; j < sizeOfColumns; j++) {
                getResultOfMultiply(matrixForMultiplyArray, sizeOfRows, sizeOfColumns, i, j, resultMatrixArray);
            }
        }
        this.matrixArray = resultMatrixArray;
    }

    private void getResultOfMultiply(int[][] matrixForMultiplyArray, int sizeOfRows, int sizeOfColumns
            , int resultX, int resultY, int[][] resultMatrixArray) {

        int size = matrixForMultiplyArray.length;
        for (int i = 0; i < size; i++) {
            resultMatrixArray[resultX][resultY] += matrixArray[resultX][i] * matrixForMultiplyArray[i][resultY];
        }
    }

    public void transpose() {
        int[][] transposeArray = new int[matrixArray[0].length][matrixArray.length];

        for (int i = 0; i < matrixArray[0].length; i++) {
            for (int j = 0; j < matrixArray.length; j++) {
                transposeArray[i][j] = matrixArray[j][i];
            }
        }
        this.matrixArray = transposeArray;
    }

    public int[][] getMatrixArray() {
        return matrixArray;
    }

    public void setMatrixArray(int[][] matrixArray) {
        this.matrixArray = matrixArray;
    }

    public void printMatrix() {

        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[0].length; j++) {
                System.out.print(matrixArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
