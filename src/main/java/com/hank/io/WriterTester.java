package com.hank.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTester {
    public static void main(String[] args) {
        try {
//            FileWriter fw = new FileWriter("output.txt");
            File jkdir = new File("c:\\123\\out");
            if (!jkdir.exists()) {
                jkdir.mkdirs();
            }

            FileWriter fw = new FileWriter("C:\\123\\out\\output.txt");
            fw.write("ABCDEF");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
