package section_2;

import java.util.LinkedList;

public class Try {

    public static void main(String[] args) {
        Chapter1Task3 chapter1Task3 = new Chapter1Task3();
        chapter1Task3.put("052", " kk");
        chapter1Task3.put("053", " kf");
        chapter1Task3.put("054", " kk");

        LinkedList n = chapter1Task3.getByName(" kk");
        System.out.println(n);
    }
}
