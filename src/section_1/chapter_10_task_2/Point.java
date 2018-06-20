package section_1.chapter_10_task_2;

public class Point implements Comparable{

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistance() {
        return (x * x) + (y * y);
    }

    @Override
    public int compareTo(Object o) {

        Point other = (Point) o;
        int result = 0;

        double thisDistance = this.getDistance();
        double otherDistance = other.getDistance();

        if (thisDistance > otherDistance) {
            result = 1;
        } else if (thisDistance < otherDistance) {
            result = -1;
        }

        return result;
    }
}
