package section_2.chapter_2_task_1;

public class MyThread extends Thread {

    private static final int REPETITION = 10;

    @Override
    public void run() {
        for (int i = 0; i < REPETITION; i++) {
            System.out.println(getName());

            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
