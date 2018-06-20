package section_1.сhapter_10_task_5;

public class Array implements Comparable{

    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getArraySize() {
        return this.array.length;
    }

    @Override
    public int compareTo(Object o) {

        int result = 0;
        Array other = (Array) o;

        if (this.getArraySize() > other.getArraySize()) {
            result = 1;
        } else if (this.getArraySize() < other.getArraySize()) {
            result = -1;
        }

        return result;
    }
}
