package br.com.ideao.app.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    private static final String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoob";
    private static final String REPLACE = "-";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        StringBuffer sb = new StringBuffer();

        while(matcher.find()) {
            matcher.appendReplacement(sb, REPLACE);
        }
        matcher.appendTail(sb);
        System.out.println(sb.toString());
    }
}
