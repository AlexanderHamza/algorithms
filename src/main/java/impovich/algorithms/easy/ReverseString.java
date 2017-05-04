package impovich.algorithms.easy;

/*
https://leetcode.com/problems/reverse-string/#/description
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
* */

/**
 * @author Alexander Hamza
 *         created 04/05/2017.
 */
public class ReverseString {

    public String reverseString(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }

    public String reverseStringRecursively(String s) {
        if (s.length() == 1) return s;
        return reverseStringRecursively(s.substring(s.length() / 2, s.length())) +
                reverseStringRecursively(s.substring(0, s.length() / 2));
    }
}
