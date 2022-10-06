package io.codelex.exceptions.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {

    public static void main(String[] args) throws IOException {
        cat(new File("C:/Users/Ramona/IdeaProjects/home-exercises-2022/majasdarbi/src/io/codelex/exceptions/practice/textFor3rdExercise.txt"));
        cat(new File("notFound"));
    }

    public static void cat(File file) throws IOException {

        //TODO - fix this method so it compiles
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
                //System.out.println(new String(line.getBytes("ISO-8859-1"), "UTF-8"));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (input != null) {
                input.close();
            }
        }

    }
}
