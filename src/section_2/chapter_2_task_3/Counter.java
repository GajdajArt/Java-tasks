package section_2.chapter_2_task_3;

public class Counter {

    private static final String FIRST_TITLE = "firsCounter : ";
    private static final String SECOND_TITLE = "secondCounter : ";

    private int firsCounter;
    private int secondCounter;

    public Counter() {
        firsCounter = 0;
        secondCounter = 0;
    }

    public synchronized void doSomething() throws InterruptedException {

        System.out.println(FIRST_TITLE + firsCounter);
        System.out.println(SECOND_TITLE + secondCounter);
        firsCounter++;
        Thread.sleep(10);
        secondCounter++;
    }
}
