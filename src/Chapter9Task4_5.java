import java.io.File;
import java.io.FileFilter;

public class Chapter9Task4_5 {

    private static final String DIR = "C:\\Users\\pc\\Desktop\\Новая папка\\CV";
    private static final String JAVA_TYPE = ".java";
    private static final String CLASS_TYPE = ".class";
    private static final String TXT_TYPE = ".txt";


    public static void main(String[] args) {

        File dir = new File(DIR);
        getFiles(dir);
    }

    private static void getFiles(File folder) {

        File[] folderEntries = folder.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                boolean result = false;
                String name = pathname.getName();
                int latIndexPfDot = name.lastIndexOf(".");
                String type = null;

                if (latIndexPfDot > 0) {
                    type = name.substring(latIndexPfDot);
                }

                if (type.equals(TXT_TYPE) || type.equals(JAVA_TYPE) || type.equals(CLASS_TYPE)) {
                    result = true;
                }
                return result;
            }
        });


        for (int i = 0; i < folderEntries.length; i++) {
            if (folderEntries[i].isDirectory()) {
                getFiles(folderEntries[i]);
                continue;
            } else {
                printName(folderEntries[i]);
            }
        }
    }

    private static void printName(File file) {

        String name = file.getName();
        int latIndexPfDot = name.lastIndexOf(".");
        String type = null;

        if (latIndexPfDot > 0) {
            type = name.substring(latIndexPfDot);
        }
        if (type.equals(TXT_TYPE) || type.equals(JAVA_TYPE) || type.equals(CLASS_TYPE)) {
            System.out.println(name);
        }

    }
}
