package br.com.ideao.app.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDemo2 {
    private static final String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoob";
    private static final String REPLACE = "-";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        INPUT = matcher.replaceAll(REPLACE);
        System.out.println(INPUT);

    }
}
