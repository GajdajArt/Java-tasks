package section_1.сhapter_7_task_1;

public class AlasException extends Exception {

    private static final String MESSAGE = "Ошибка введения данных";

    public AlasException() {
        super(MESSAGE);
    }
}
