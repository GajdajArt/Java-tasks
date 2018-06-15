package chapter_10_task_2;

import java.util.Iterator;
import java.util.TreeSet;

public class Try {

    public static void main(String[] args) {

        TreeSet set = new TreeSet();

        for (int i = 0; i < 10; i++) {
            set.add(new Point(Math.random() * 10, Math.random() * 10));
        }

        print(set);
    }

    private static void print(TreeSet<Point> set) {

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            System.out.println(point.getDistance());
        }
    }
}
