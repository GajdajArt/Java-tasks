package section_1.chapter_4_task_2;

public class Try {

    private static final String ITEM = "item ";

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        for (int i = 0; i < 120; i++) {
            vector.add(ITEM + i);
        }

        vector.showAllItems();
    }
}
