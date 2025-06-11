package br.com.ideao.app.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo {
    private static final String REGEX = "\\bdog\\b";
    private static final String INPUT = "dog dog dog doggie dog";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Matcher number " + count);
            System.out.println("start(): " + matcher.start());
            System.out.println("group(): " + matcher.group());
            System.out.println("end(): " + matcher.end());
        }
    }
}
