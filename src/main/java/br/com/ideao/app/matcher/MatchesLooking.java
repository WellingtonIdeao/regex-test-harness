package br.com.ideao.app.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesLooking {
    private static final String REGEX = "foo";
    private static final String INPUT = "foooooooooooo";

    public static void main(String[] args) {
       Pattern pattern = Pattern.compile(REGEX) ;
       Matcher matcher = pattern.matcher(INPUT);

        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("Current INPUT is: " + INPUT);

        System.out.println("LookingAT(): " + matcher.lookingAt());
        System.out.println("matches(): " + matcher.matches());

    }
}

