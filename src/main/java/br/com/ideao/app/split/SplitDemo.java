package br.com.ideao.app.split;

import java.util.regex.Pattern;

public class SplitDemo {
    private static final String REGEX = ":";
    private static final String INPUT = "one:two:three:four:five";

    public static void main(String[] args) {
       Pattern pattern = Pattern.compile(REGEX);
       String[] items = pattern.split(INPUT);
       for (String s: items) {
           System.out.println(s);
       }
    }

    private static void matchesMethodExample() {
        boolean matches = Pattern.matches(REGEX, "1");
        if(matches) {
            System.out.println("matches");
        } else {
            System.out.println("don't matches");
        }
    }
}
