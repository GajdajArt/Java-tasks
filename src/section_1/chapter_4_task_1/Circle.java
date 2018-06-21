package section_1.chapter_4_task_1;

import org.junit.jupiter.api.Test;

public class Circle {

    private double x;
    private double y;
    private double radius;

    private static final String CENTER_DESCRIPTION = "Координаты центра окружности: ";
    private static final String RADIUS_DESCRIPTION = "Радиус окружности: ";

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public boolean isInside(double x, double y) {

        boolean result;
        double dx = this.x - x;
        double dy = this.y - y;

        if ((radius * radius) >= (dx * dx + dy * dy)) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public boolean isInside(Circle incomingCircle) {

        boolean result;
        double dx = x - incomingCircle.getX();
        double dy = y - incomingCircle.getY();
        double maxRadius = radius - incomingCircle.getRadius();

        if ((Math.pow(maxRadius, 2)) >= (Math.pow(dx, 2) + Math.pow(dy, 2))) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public void showParamsOfInstance() {
        System.out.println(CENTER_DESCRIPTION + x + " : " + y);
        System.out.println(RADIUS_DESCRIPTION + radius);
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
