package chapter_4_task_1;

import java.util.Vector;

public class Try {

    private static final double FIRST_CIRCLE_X = 5.3;
    private static final double FIRST_CIRCLE_Y = 6.7;
    private static final double FIRST_CIRCLE_RADIUS = 15;

    private static final double SECOND_CIRCLE_X = 1;
    private static final double SECOND_CIRCLE_Y = 2;
    private static final double SECOND_CIRCLE_RADIUS = 3.5;

    private static final double MOVE_TO_X = 5.3;
    private static final double MOVE_TO_Y = 5.3;

    public static void main(String[] args) {

        Circle circleOne = new Circle(FIRST_CIRCLE_X, FIRST_CIRCLE_Y, FIRST_CIRCLE_RADIUS);
        Circle circleTWo = new Circle(SECOND_CIRCLE_X, SECOND_CIRCLE_Y, SECOND_CIRCLE_RADIUS);

        circleOne.move(MOVE_TO_X, MOVE_TO_Y);

        System.out.println(circleOne.isInside(circleTWo));

        circleOne.showParamsOfInstance();
        circleTWo.showParamsOfInstance();

    }
}
