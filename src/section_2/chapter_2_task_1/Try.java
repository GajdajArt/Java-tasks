package section_2.chapter_2_task_1;

public class Try {

    private static final String NAME = "myThread";

    public static void main(String[] args) {

        runByRunnable();
        runByThread();
    }

    private static void runByThread() {

        MyThread myThread = new MyThread();
        myThread.setName(NAME);
        myThread.start();
    }

    private static void runByRunnable() {
        new MyRunnableThread(NAME);
    }
}
