import java.io.*;

public class Chapter9Task2 {

    private static final String INPUT_LINE = "Хочу все на свете знать";
    private static final String REPLACEABLE_CHARS = "аХн";
    private static final String SUBSTITUTING_CHARS = "T!<";
    private static final int LAST_ITEM = 65535;


    public static void main(String[] args) {

        try {
            replaceChars(INPUT_LINE, REPLACEABLE_CHARS, SUBSTITUTING_CHARS);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void replaceChars(String inputText, String replaceableChars, String substitutingChars) throws IOException {

        StringReader reader = new StringReader(inputText);
        char c;

        while ((c = (char) reader.read()) != LAST_ITEM) {
            System.out.print(replace(c, replaceableChars, substitutingChars));
        }
    }

    private static char replace(char c, String replaceableChars, String substitutingChars) {

        char result = c;

        for (int i = 0; i < replaceableChars.length(); i++) {
            if (c == replaceableChars.charAt(i)) {
                result = substitutingChars.charAt(i);
            }
        }

        return result;
    }
}
