package section_2.chapter_2_task_3;

public class Try {

    public static void main(String[] args) {

        Counter counter = new Counter();

        MyThread myThreadA = new MyThread(counter);
        myThreadA.start();
        MyThread myThreadB = new MyThread(counter);
        myThreadB.start();
        MyThread myThreadC = new MyThread(counter);
        myThreadC.start();
        MyThread myThreadD = new MyThread(counter);
        myThreadD.start();
        MyThread myThreadE = new MyThread(counter);
        myThreadE.start();
    }
}

