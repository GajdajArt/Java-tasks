package section_1.chapter_5_task_1;

public abstract class Point {

    private int x;
    private int y;

    abstract void print();

    abstract void scale(int scaleCoefficient);

    public void move(int x, int y) {

        this.x += x;
        this.y += y;

    }
}
