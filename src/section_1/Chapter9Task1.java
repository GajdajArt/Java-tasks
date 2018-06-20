package section_1;

import java.io.*;

public class Chapter9Task1 {

    private static final String TITLE_A = "First file";
    private static final String TITLE_B = "Second file";
    private static final String SOME_TEXT = "Some text";
    private static final String SOME_NEW_TEXT = "Some new text";
    private static final String DIR = "C:\\Users\\pc\\Desktop";

    private static final int BUFFER_SIZE = 1024;



    public static void main(String[] args) {

        File firstFile = createFile(TITLE_A, SOME_TEXT);
        File secondFile = createFile(TITLE_B, "");

        try {
            copy(firstFile, secondFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        copy(TITLE_A, TITLE_B);

    }

    private static File createFile(String title, String inputText) {

        File file = null;
        try {
            File dir = new File(DIR);
            file = new File(dir, title + ".txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(inputText);
            output.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return file;
    }

    private static void copy(String originalName, String newName) {

        File originalFile = new File(DIR, originalName + ".txt");
        File newFile = new File(DIR, newName + ".txt");

        try {
            FileWriter writer = new FileWriter(originalFile.getPath(), true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(SOME_NEW_TEXT);
            bufferWriter.close();

            copy(originalFile, newFile);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void copy(File originalFile, File newFile) throws IOException {

        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(originalFile);
            os = new FileOutputStream(newFile);
            byte[] buffer = new byte[BUFFER_SIZE];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
