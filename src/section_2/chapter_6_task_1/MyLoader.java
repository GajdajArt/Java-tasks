package section_2.chapter_6_task_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MyLoader extends ClassLoader {

    public final String classPath;

    public MyLoader(String classPath) {
        this.classPath = classPath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        Class result;
        File f = findFile(name.replace('.','/'),".class");

        try {
            byte[] classBytes= loadFileAsBytes(f);
            result = defineClass(name,classBytes,0,classBytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException(e.getMessage());
        } catch (ClassFormatError e) {
            throw new ClassNotFoundException(e.getMessage());
        }

        return result;
    }

    @Override
    protected URL findResource(String name) {

        URL result = null;
        File f = findFile(name, "");
        if (f != null) {
            try {
                result = f.toURL();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static byte[] loadFileAsBytes(File file) throws IOException {

        byte[] result = new byte[(int) file.length()];
        FileInputStream f = new FileInputStream(file);

        try {
            f.read(result,0, result.length);
        } finally {
            f.close();
        }
        return result;
    }

    private File findFile(String name, String extension) {
        return new File((new File(classPath)).getPath() +
                File.separatorChar + name.replace('/',File.separatorChar) + extension);
    }
}
