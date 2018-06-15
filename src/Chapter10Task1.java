import java.util.*;

public class Chapter10Task1 {

    private static final int[] ARRAY_A = {2, 4, 6, 5, 8};
    private static final int[] ARRAY_B = {9, 4, 1, 5, 2};

    public static void main(String[] args) {

        List listA = new ArrayList();
        List listB = new ArrayList();

        for (int i = 0; i < ARRAY_A.length; i++) {
            listA.add(ARRAY_A[i]);
            listB.add(ARRAY_B[i]);
        }

        System.out.println(getAmountOfLists(listA, listB));
        System.out.println(getUniqueList(listA, listB));

        System.out.println(getDifference(listA, listB));

    }

    private static List getAmountOfLists(List listA, List listB) {

        List result = listA;
        result.addAll(listB);

        return result;
    }

    private static Set getUniqueList(List listA, List listB) {

        Set result = new HashSet();
        result.addAll(listA);
        result.addAll(listB);

        return result;
    }

    private static Set getDifference(List listA, List listB) {

        Set result = new HashSet();
        Set buf = new HashSet();
        buf.addAll(listB);

        for (int i = 0; i < listA.size(); i++) {
            if (buf.add(listA.get(i))) {
                result.add(listA.get(i));
            }
        }

        return result;
    }
}
