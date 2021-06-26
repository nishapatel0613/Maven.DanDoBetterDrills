package com.zipcodewilmington.danny_do_better_exercises;

import java.util.Scanner;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment ;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        return(String) (firstSegment + secondSegment);
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String firstThreeChars = "";
        if ( input.length() > 3){
            firstThreeChars = input.substring(0,3);
        } else {
            firstThreeChars = input;
        }

        return firstThreeChars ;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String lastThreeChars = "";
        if ( input.length() < 3){
            lastThreeChars = input.substring(0,input.length()-1);
        } else {
            lastThreeChars = input.substring((input.length()-3),input.length());
        }

        return lastThreeChars;

    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){

        return (inputValue.equals(comparableValue));
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){


        int len = inputValue.length();
        int c = len/2;
        char Character[] = inputValue.toCharArray();

        if((len%2)== 0)
        return Character[c-1];

        else
        return Character[c];
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){

        String[] trim = spaceDelimitedString.split("\\s+");

        String firstSequence  = trim[0];

        return  firstSequence;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){

        String[] trim = spaceDelimitedString.split("\\s+");

        String second  = trim[1];

        return  second;

    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){

        if (stringToReverse == null || stringToReverse.equals("")) {
            return stringToReverse;
        }

        // get string length
        int n = stringToReverse.length();

        // create a character array of the same size as that of string
        char[] temp = new char[n];

        // fill character array backward with characters in the string
        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = stringToReverse.charAt(i);
        }

        // convert character array to string and return it
        return String.copyValueOf(temp);


    }
}
