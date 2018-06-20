package section_1.chapter_7_task_2;

public class QueueException extends Exception{

    public static final String QUEUE_IS_FULL_MESSAGE = "Очередь переполнена";
    public static final String QUEUE_IS_EMPTY_MESSAGE = "Очередь пуста";

    public QueueException(String message) {
        super(message);
    }
}
