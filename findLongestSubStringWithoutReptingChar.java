package design.test;


import java.io.*;
import java.util.Arrays;


public class findLongestSubStringWithoutReptingChar {
    public static void main(String[] args) {
        String str = "abcabcdabcde";
        System.out.println( getSubString(str));

    }
    public static String getSubString(String str) {

        if (str==null || str.isEmpty() || str.isBlank())
            return "Invalid String Value Passed";
        String test = "";
        String large = "";

        for (char c : str.toCharArray()) {

            String temp = String.valueOf(c);

            if (!test.contains(temp)) {

                test =test+ temp;
            } else {

                if(large.length()<test.length()) {

                    large = test;
                    test= temp;
                }
//                else {
//                    small=test;
//                    test= temp;
//
//                }
            }
        }

        return (large.length()<test.length())?test:large;
    }

}
