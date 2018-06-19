package section_2.chapter_2_task_4;

public class MyThread extends Thread {

    private Try.Counter counter;

    public MyThread(Try.Counter counter) {
        super();
        this.counter = counter;
    }

    @Override
    public void run() {

        counter.add();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {}
        counter.minus();
    }
}
