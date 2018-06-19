package section_2.chapter_3_task_1;

public class Try {


    public static void main(String[] args) {

        MyThread a = new MyThread();
        MyThread b = new MyThread();

        a.setOtherThread(b);
        b.setOtherThread(a);

        a.start();
        b.start();
    }
}
