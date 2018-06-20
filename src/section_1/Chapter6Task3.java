package section_1;

public class Chapter6Task3 {

    private static final String INPUT_LINE_A = "привет";
    private static final String INPUT_LINE_B = "приват";

    public static void main(String[] args) {
        System.out.print(getMissingLetters(INPUT_LINE_A, INPUT_LINE_B));
    }

    private static StringBuffer getMissingLetters(String lineA, String lineB) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < lineA.length(); i++) {
            checkLetter(lineA.charAt(i), lineB, result);
        }

        return result;
    }

    private static StringBuffer checkLetter(char c, String checkedLine, StringBuffer buffer) {

        boolean isMissing = true;

        for (int j = 0; j < checkedLine.length(); j++) {
            if (c == checkedLine.charAt(j)) {
                isMissing = false;
            }
        }

        if (isMissing) {
            buffer.append(c);
        } else {
            isMissing = true;
        }

        return buffer;
    }
}
