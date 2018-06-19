package section_2.chapter_2_task_2;

public class MySchedule {

    private String[] messages;
    private long[] time;

    public MySchedule(String[] messages, long[] time) {
        this.messages = messages;
        this.time = time;
    }

    public void run() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < time.length; i++) {

                    try {
                        Thread.sleep(time[i]);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(messages[i]);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
