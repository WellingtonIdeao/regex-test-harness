package br.com.ideao.app.split;

import java.util.regex.Pattern;

public class SplitDemo2 {
    private static final String REGEX =  "\\d";
    private static final String INPUT = "one9two4three7four1five";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        String[] items = pattern.split(INPUT);
        for (String s: items) {
            System.out.println(s);
        }
    }
}
