package section_2.chapter_4_task_1_3;

import java.io.*;

public class Try {

    private static final String FILE = "test.txt";

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(new MyLinkedList.Point(5, 7));
        myLinkedList.add(new MyLinkedList.Point(3, 4));
        myLinkedList.add(new MyLinkedList.Point(4, 1));

        MyLinkedList test = null;

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FILE));
            os.writeObject(myLinkedList);

            ObjectInputStream is = new ObjectInputStream(new FileInputStream(FILE));
            test = (MyLinkedList) is.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.print(test.getSize());

    }
}
