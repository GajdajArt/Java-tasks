package chapter_4_task_2;

import chapter_4_task_1.Circle;

public class Vector<T> {

    private T[] array;
    private int numberOfLinks;

    public Vector() {
//        this.array = new T[100];
    }

    public Vector(T[] array) {
        this.array = array;
        numberOfLinks = array.length;
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public Circle get(int position) {
        return null;
    }
}
