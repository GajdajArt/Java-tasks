package chapter_5_task_1;

public class Picture extends Rectangle {

    private int[][] figure;

    public int[][] getFigure() {
        return figure;
    }

    public void setFigure(int x, int y, int[][] figure) {
        move(x, y);
        this.figure = figure;
    }

    @Override
    public void print() {
        for (int i = 0; i < figure.length; i++) {
            for (int j = 0; j < figure[0].length; j++) {
                System.out.print(figure[i][j]);
            }
            System.out.print("\n");
        }
    }

    @Override
    public void scale(int scaleCoefficient) {
        int[][] scaleFigure = new int[figure.length * scaleCoefficient][figure[0].length * scaleCoefficient];
    }

    public void add(Picture pictureForAdding) {

        int[][] matrixForAddingArray = pictureForAdding.getFigure();

        if (figure[0].length == matrixForAddingArray[0].length &&
                figure.length == matrixForAddingArray.length) {

            addNewMatrix(matrixForAddingArray);
        }
    }

    private void addNewMatrix(int[][] matrixForAddingArray) {

        for (int i = 0; i < figure.length; i++) {
            for (int j = 0; j < figure[0].length; j++) {
                this.figure[i][j] += matrixForAddingArray[i][j];
            }
        }
    }
}
