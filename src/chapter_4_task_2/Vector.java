package chapter_4_task_2;

public class Vector<T> {

    private static final int DEFAULT_SIZE = 100;

    private T[] array;
    private int numberOfLinks;

    public Vector() {
        this.array = (T[]) new Object[DEFAULT_SIZE];
        numberOfLinks = 0;
    }

    public Vector(T[] array) {
        this.array = array;
        numberOfLinks = array.length;
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        numberOfLinks = 0;
    }

    public void add(T object) {
        numberOfLinks++;
        if (array.length >= numberOfLinks) {
            array[numberOfLinks - 1] = object;
        } else {
            T[] newArray = (T[]) new Object[numberOfLinks];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[numberOfLinks - 1] = object;
            array = newArray;
            newArray = null;
        }
    }

    public void remove(int position) {
        if (array.length > position) {
            array[position] = null;
            numberOfLinks--;
        }
    }

    public T get(int position) {
        return array[position];
    }

    public void showAllItems() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i].toString());
            }
        }
    }

    public int size() {
        return numberOfLinks;
    }
}
