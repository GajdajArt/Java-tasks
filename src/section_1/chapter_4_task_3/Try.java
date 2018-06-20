package section_1.chapter_4_task_3;

public class Try {

    private static final int[][] MATRIX_ARRAY_A = {{33,34,12},
                                                  {33,19,10},
                                                  {12,14,17},
                                                  {84,24,51},
                                                  {43,71,21}};



    private static final int[][] MATRIX_ARRAY_B = {{10,11,34,55},
                                                   {33,45,17,81},
                                                   {45,63,12,16}};



    public static void main(String[] args) {

        Matrix firstMatrix = new Matrix(0, 0);
        Matrix secondMatrix = new Matrix(0, 0);

        firstMatrix.setMatrixArray(MATRIX_ARRAY_A);
        secondMatrix.setMatrixArray(MATRIX_ARRAY_B);
        firstMatrix.multiplyOnMatrix(secondMatrix);


        firstMatrix.printMatrix();

    }
}
