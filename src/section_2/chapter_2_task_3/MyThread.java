package section_2.chapter_2_task_3;

public class MyThread extends Thread {

    private Counter counter;

    public MyThread(Counter counter) {
        super();
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            counter.doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
