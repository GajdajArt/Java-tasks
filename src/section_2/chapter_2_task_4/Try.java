package section_2.chapter_2_task_4;

public class Try {

    public static void main(String[] args) {

        Counter counter = new Counter();

        for (int i = 0; i < 10000; i++) {
            MyThread myThread = new MyThread(counter);
            myThread.start();
        }
    }

    public static class Counter {

        private int i;
        private int max;

        public Counter() {
            this.i = 0;
            this.max = 0;
        }

        public synchronized void add(){
            i++;

            if (i > max) {
                max = i;
            }

            System.out.println(max);
        }

        public synchronized void minus(){
            i--;
        }
    }
}
