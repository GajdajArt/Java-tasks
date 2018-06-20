package section_2.chapter_5_task_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Try {

    public static void main(String[] args) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException, InstantiationException {

        try {

            Class cl = Class.forName(Author.class.getName());
            Author o = (Author) cl.newInstance();
            Method getLastName = cl.getDeclaredMethod("getLastName");
            System.out.println((String) getLastName.invoke(o));
            Method getLastStaticName = cl.getDeclaredMethod("getLastStaticName");
            System.out.println((String) getLastStaticName.invoke(cl));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
