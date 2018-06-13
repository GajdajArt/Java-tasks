package test;

import java.io.IOException;

public class StringsTest{




    public static void main(String[] args) throws java.io.IOException {

        byte[] b = new byte[100];
        int i = System.in.read(b);

        String s = new String(b, 0, i-1);
        System.out.print(s);

     }
}
