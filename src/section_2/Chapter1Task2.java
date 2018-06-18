package section_2;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Chapter1Task2 {

    private static final String[] KES = {"строки", "строка", "строку"};
    private static final String DIR = "/home/NIX/gajdaj/Desktop/В. String";

    public static void main(String[] args) {

        String text = null;
        try {
            text = readFile(DIR, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Set result = analyzeText(text).entrySet();
        System.out.println(result);
    }

    static String readFile(String path, Charset encoding) throws IOException {

        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    private static Map analyzeText(String text) {

        HashMap map = new HashMap();

        for (int i = 0; i <KES.length; i++) {
            checkText(text, map, i);
        }

        return map;
    }

    private static void checkText(String text, HashMap hashMap, int pos) {

        int lastPos = 0;
        int counter = 0;

        while (text.indexOf(KES[pos], lastPos) != -1) {
            lastPos = text.indexOf(KES[pos], lastPos) + 1;
            counter++;
        }

        hashMap.put(KES[pos], counter);
    }
}
