package section_1;

import java.util.Scanner;

public class Chapter6Task1 {

    private static final String[][] BASE_ARRAY = {{"привет", "день", "белое"},{"пока", "ночь", "черное"}};
    private static final int EXCESS = 5;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        System.out.print(replaceWord(inputLine));

    }

    private static String replaceWord(String inputLine) {
        String outputLine = inputLine;

        for (int i = 0; i < BASE_ARRAY[0].length; i++){
            try {
                outputLine = outputLine.replace(BASE_ARRAY[0][i], BASE_ARRAY[1][i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        return outputLine;
    }
}
