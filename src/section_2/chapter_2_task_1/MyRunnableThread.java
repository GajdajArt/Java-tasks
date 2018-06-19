package section_2.chapter_2_task_1;

public class MyRunnableThread implements Runnable {

    private static final int REPETITION = 10;

    public MyRunnableThread(String name) {
        Thread thread = new Thread(this);
        thread.setName(name);
        thread.start();
    }

    @Override
    public void run() {

            for (int i = 0; i < REPETITION; i++) {
                System.out.println(Thread.currentThread().getName());

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}
