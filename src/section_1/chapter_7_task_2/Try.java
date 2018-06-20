package section_1.chapter_7_task_2;

public class Try {

    private static final int SIZE = 5;
    private static final int EXCESS = 5;

    public static void main(String[] args) {

        Queue queue = new Queue(SIZE);

        for (int i = 0; i < SIZE + EXCESS; i++) {
            try {
                queue.push(i);
                System.out.println(i);
            } catch (QueueException e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < SIZE + EXCESS; i++) {
            try {
                queue.pop();
                System.out.println(i);
            } catch (QueueException e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < SIZE + EXCESS; i++) {
            try {
                queue.push(i);
                System.out.println(i);
            } catch (QueueException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
