package section_2.chapter_3_task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer extends Thread {

    BufferedReader bufferedReader;

    public Timer(BufferedReader bufferedReader) {
        super();
        this.bufferedReader = bufferedReader;
    }

    @Override
    public void run() {

        try {
            while (!bufferedReader.ready()) {
                try {
                    Thread.sleep(1000);
                    getTime();
                } catch (InterruptedException e) {
                    interrupt();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getTime() {
        Date curDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
        String DateToStr = format.format(curDate);
        System.out.println(DateToStr);
    }


}
