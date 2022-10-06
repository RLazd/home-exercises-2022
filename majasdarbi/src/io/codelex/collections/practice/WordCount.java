package io.codelex.collections.practice;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {

        final Path path = Paths.get(WordCount.class.getResource(file).toURI());
        //Files.readAllLines(path, charset);


        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        for (String line : Files.readAllLines(path, charset)) {
            //System.out.println(line);
            lineCount++;

            String[] arrOfwords = line.replaceAll("[!.?,]", "").split(" ");
            for (String word : arrOfwords) {
                if (word.length() >= 2) {
                    wordCount++;
                } else if (word.equals("I")) {
                    wordCount++;
                }
            }

            charCount += line.split("").length;
        }

        System.out.println("Lines = " + lineCount);
        System.out.println("Words = " + wordCount);
        System.out.println("Chars = " + charCount);

    }
}

