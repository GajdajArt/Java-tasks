package section_2;

public class Try {

    private static final String[] USER_A = {"Иванов", "050 737"};
    private static final String[] USER_B = {"Петров", "050 765"};
    private static final String[] USER_C = {"Сидоров", "050 745"};
    private static final String[] USER_D = {"Иванов", "050 861"};


    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.put(USER_A);
        phoneBook.put(USER_B);
        phoneBook.put(USER_C);
        phoneBook.put(USER_D);

        System.out.println(phoneBook.entrySet());
    }
}
