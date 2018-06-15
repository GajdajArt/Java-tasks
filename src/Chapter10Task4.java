import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter10Task4 {

    private static final String LINE = "Some   English Text  ds";

    public static void main(String[] args) {

        int size = 0;

        List<String> myList = new ArrayList<String>(Arrays.asList(LINE.split(" ")));
        System.out.println(myList.size());

            if (LINE.length() > 0) {
                size = 1;

                for (int i = 1; i < LINE.length(); i++) {
                    if ((LINE.charAt(i) != ' ') && (LINE.charAt(i - 1) == ' ')) {
                        size++;
                    }
            }
        }

        System.out.println(size);
    }
}
