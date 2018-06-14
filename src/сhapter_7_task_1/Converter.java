package сhapter_7_task_1;

import java.util.Scanner;

public class Converter {

    private static final String RESULT_DESCRIPTION = "Это число: ";
    private static final String PROGRAM_STOP_DESCRIPTION = "THE END";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        try {

            int result = convert(inputLine);
            System.out.println(RESULT_DESCRIPTION + result);

        } catch (AlasException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(PROGRAM_STOP_DESCRIPTION);
        }

    }

    private static int convert(String inputLine) throws AlasException {
        int result;

        try {
            result = Integer.parseInt(inputLine);
        } catch (NumberFormatException e) {
            throw new AlasException();
        }

        return result;
    }
}
