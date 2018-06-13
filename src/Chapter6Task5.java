import java.util.Scanner;

public class Chapter6Task5 {

    private static final char[] PUNCTUATION_MARKS_ARRAY = {' ', ',', '.', '!', '?'};

    private static final short FIRST_WORD = 0;
    private static final short PUNCTUATION_MARK = 1;
    private static final short LAST_WORD = 2;
    private static final short SIMPLE_LETTER = 3;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        printArray(splitSentence(inputLine));
    }

    private static String[] splitSentence(String inputLine) {
        String[] result = new String[0];
        StringBuffer newWord = new StringBuffer();

        for (int i = 0; i < inputLine.length(); i++) {

            switch (checkLetter(inputLine, i)) {
                case FIRST_WORD:
                    newWord = new StringBuffer();
                    newWord.append(inputLine.charAt(i));
                    break;
                case PUNCTUATION_MARK:
                    result = addNewWord(result, newWord);
                    newWord = new StringBuffer();
                    break;
                case SIMPLE_LETTER:
                    newWord.append(inputLine.charAt(i));
                    break;
                case LAST_WORD:
                    newWord.append(inputLine.charAt(i));
                    result = addNewWord(result, newWord);
                    break;
                default:
                        break;
            }
        }
        return result;
    }

    private static String[] addNewWord(String[] stringArray, StringBuffer newWord) {
        String[] newStringArray = new String[stringArray.length + 1];
        for (int i = 0; i < stringArray.length; i++) {
            newStringArray[i] = stringArray[i];
        }
        newStringArray[stringArray.length] = newWord.toString();
        return newStringArray;
    }

    private static int checkLetter(String inputString, int position) {

        int result;

        if (position == inputString.length() - 1) {
            result = LAST_WORD;
        } else if (position == 0) {
            result = FIRST_WORD;
        } else {
            result = SIMPLE_LETTER;
        }

        for (int i = 0; i < PUNCTUATION_MARKS_ARRAY.length; i++) {
            if ((inputString.charAt(position) == PUNCTUATION_MARKS_ARRAY[i])) {
                result = PUNCTUATION_MARK;
                break;
            }
        }

        return result;
    }

    private static void printArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }


}
