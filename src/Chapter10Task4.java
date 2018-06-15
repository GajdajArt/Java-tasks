import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter10Task4 {

    private static final String LINE = "Some   English   Text  ds";

    public static void main(String[] args) {

        String replaceSpace = LINE.replaceAll("\\s+", " ");
        List<String> myList = new ArrayList<String>(Arrays.asList(replaceSpace.split(" ")));
        System.out.println(myList.size());
    }
}
