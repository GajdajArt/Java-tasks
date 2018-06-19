package section_2.chapter_2_task_4;

public class Try {

    public static void main(String[] args) {


        for (int i = 0; i < Integer.MAX_VALUE; i++) {

            MyThread myThread = new MyThread();
            myThread.start();
        }
    }
}
