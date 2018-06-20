package section_1;

public class Chapter6Task2 {

    private static final String INPUT_LINE = "aбвгд";

    public static void main(String[] args) {
        System.out.print(invertStringLine(INPUT_LINE));

    }

    private static final String invertStringLine(String inputLine) {

        int length = inputLine.length();
        char[] resultArray = new char[length];

        for (int i = 0; i < inputLine.length(); i++) {
            resultArray[(length - 1) - i] = inputLine.charAt(i);
        }

        return new String(resultArray);
    }
}
