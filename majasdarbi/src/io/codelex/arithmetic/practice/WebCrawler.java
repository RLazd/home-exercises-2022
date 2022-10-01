package io.codelex.arithmetic.practice;

import java.io.IOException;

public class WebCrawler {

    public class InterestingClass {

        public static void main(String[] args) throws IOException {

            String theURL = "https://www.tvnet.lv";
            URL url = new URL(theURL);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            StringBuffer buffer = new StringBuffer();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                buffer.append(inputLine);
            }
            in.close();

            String pageText = buffer.toString();

            Pattern MY_PATTERN = Pattern.compile("([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z0-9_-]+)");

            Matcher m = MY_PATTERN.matcher(pageText);
            while (m.find()) {
                String s = m.group(1);
                System.out.println(s);
            }
        }

    }
}
