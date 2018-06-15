package сhapter_10_task_5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Try {

    private static final int[] ARRAYS_SIZE = {3, 5, 2, 1, 7};

    public static void main(String[] args) {

        TreeSet set = new TreeSet();

        for (int i = 0; i < ARRAYS_SIZE.length; i++) {
            int size = ARRAYS_SIZE[i];
            set.add(new Array(new int[size]));
        }

        print(set);
    }

    private static void print(TreeSet<Array> set) {

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Array array = (Array) iterator.next();
            System.out.println(Arrays.toString(array.getArray()));
        }

    }
}
