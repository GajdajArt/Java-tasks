package section_2.chapter_5_task_1;

import java.util.LinkedList;

public class Try {

    public static void main(String[] args) {

        try {
            Class cl = Class.forName(LinkedList.class.getName());
            Class[] faces = cl.getInterfaces();

            while (cl != null){
                System.out.println(cl.getName());
                System.out.println();

                for (int i = 0; i < faces.length; i++) {
                    System.out.println(faces[i].getName());
                }
                cl = cl.getSuperclass();
                faces = cl.getInterfaces();
            }

        } catch (ClassNotFoundException e) {

        } catch (NullPointerException e) {

        }
    }
}
