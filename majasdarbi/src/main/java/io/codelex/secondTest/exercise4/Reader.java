package io.codelex.secondTest.exercise4;

import java.io.*;
import java.util.Stack;

public class Reader {

    private static final String PATH_TO_APP = "/Users/Ramona/IdeaProjects/home-exercises-2022/majasdarbi/src/main/java/io/codelex/secondTest/exercise4/";

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(PATH_TO_APP + "From"));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH_TO_APP + "ToBuffered"));

        String line;
        while ((line = in.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = line.toCharArray().length - 1; i >= 0; i--) {
                sb.append(line.toCharArray()[i]);
            }
            out.write(sb.toString());
            out.write("\n");
        }

        in.close();
        out.close();

    }
}

//Write a program that will read any file and save it in the same folder.
// The content and title of the new file should be reversed (from the back).
//(you can freely choose folder and file to test functionality)
