import java.util.Scanner;

public class Chapter6Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        SplitterC5T5 splitter = new SplitterC5T5(inputLine);
        splitter.printArray();

    }
}
