package section_2.chapter_2_task_4;

public class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {}

    }
}
