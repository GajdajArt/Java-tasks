package section_2.chapter_3_task_1;

public class MyThread extends Thread {

    private MyThread otherThread;

    @Override
    public void run() {
        otherThread.getBlock();
    }

    public void setOtherThread(MyThread otherThread) {
        this.otherThread = otherThread;
    }


    public synchronized void getBlock(){

        System.out.println(getName() + " Start");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (otherThread) {
            otherThread.getBlock();
        }

        System.out.println(getName() + "Stop");
    }
}
