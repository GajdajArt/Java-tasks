package section_2.chapter_4_task_1_3;

import java.io.Serializable;

public class MyLinkedList implements Serializable {

    private Point firstPint;
    private Point lastPoint;
    private int size;

    public MyLinkedList() {
        clear();
    }

    public void add(Point newPoint) {

        if (size == 0) {
            firstPint = newPoint;
            lastPoint = newPoint;
        } else {
            lastPoint.setNextPoint(newPoint);
            newPoint.setPreviousPoint(lastPoint);
            lastPoint = newPoint;
        }
        size++;
    }

    public Point get(int pos) {

        Point point = null;
        if (size > 0 && pos < size) {

            if (pos == 0) {
                point = firstPint;
            } else if (pos == size - 1) {
                point = lastPoint;
            } else if (pos == 1){
                point = firstPint.getNextPoint();
            } else {
                Point nextPoint = firstPint.getNextPoint();
                for (int i = 1; i < pos; i++) {
                    point = nextPoint.nextPoint;
                }
            }
        }
        return point;
    }

    public void clear () {
        firstPint = null;
        lastPoint = null;
        size = 0;
    }

    public Point getFirstPint() {
        return firstPint;
    }

    public Point getLastPoint() {
        return lastPoint;
    }

    public int getSize() {
        return size;
    }


    public static class Point implements Serializable {

        private int x;
        private int y;
        private Point nextPoint;
        private Point previousPoint;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public Point getNextPoint() {
            return nextPoint;
        }

        private void setNextPoint(Point nextPoint) {
            this.nextPoint = nextPoint;
        }

        public Point getPreviousPoint() {
            return previousPoint;
        }

        private void setPreviousPoint(Point previousPoint) {
            this.previousPoint = previousPoint;
        }
    }

}
