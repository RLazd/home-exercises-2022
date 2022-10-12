package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        System.out.println(scores);

        String[] arrOfScores = scores.split(" ");

        int first = 0;
        int second = 9;
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < arrOfScores.length; j++) {
                int score = Integer.parseInt(arrOfScores[j]);
                if (score >= first && score <= second) {
                    count++;
                }
            }

            if (i == 0) {
                System.out.println("0" + first + "-0" + second + ":" + "*".repeat(count));
            } else {
                System.out.println(first + "-" + second + ":" + "*".repeat(count));
            }

            first += 10;
            second += 10;
        }

        int countFor100 = Arrays.stream(arrOfScores).filter(num -> Integer.parseInt(num) == 100).toArray().length;
        System.out.println("  100:" + "*".repeat(countFor100));


    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());

        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);


    }
}
