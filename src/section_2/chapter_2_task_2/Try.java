package section_2.chapter_2_task_2;

public class Try {

    private static final String[] MESSAGES = {"Firs message", "Second message",
            "Next message", "And one more message"};
    private static final long[] TIMES = {500, 100, 2000, 3000};

    public static void main(String[] args) {
        MySchedule mySchedule = new MySchedule(MESSAGES, TIMES);
        mySchedule.run();
    }
}
