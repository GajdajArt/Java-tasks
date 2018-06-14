package chapter_7_task_2;

public class Queue {

    private int array[];
    private int positionToPush;

    public Queue(int size) {
        array = new int[size];
        positionToPush = -1;

    }

    public void push(int item) throws QueueException {

        if ((positionToPush + 1) < (array.length)) {
            positionToPush++;
            array[positionToPush] = item;
        } else {
            throw new QueueException(QueueException.QUEUE_IS_FULL_MESSAGE);
        }

    }

    public int pop() throws QueueException {

        int result;

        if (positionToPush >= 0) {
            result = array[0];
            moveArray();
        } else {
            throw new QueueException(QueueException.QUEUE_IS_EMPTY_MESSAGE);
        }

        return result;
    }

    private void moveArray() {

        for (int i = 1; i < positionToPush - 1; i++) {
            array[i - 1] = array[i];
        }
        positionToPush--;
    }
}
