package question01;

import java.util.*;

/**
 * Question 01 This program checks if a string is a palindrome.
 *
 * @author Chris Barnbeck
 */
public class Question01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        //Throw exception if the string is empty
        if ((s.length() <= 0)) {
            throw new IllegalArgumentException("Enter a valid string");
        }
        //Throw exception if characters are not all letters
        for (int count = 0; count < s.length(); count++) {
            char letterCheck = s.charAt(count);
            if (!Character.isLetter(letterCheck)) {
                throw new IllegalArgumentException("Enter a valid string");
            }

        }
        if (palindrome(s)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }

    /**
     *
     * @param s is the string we are checking
     * @return true if string is palindrome, and false otherwise
     */
    public static boolean palindrome(String s) {
        int left = 0, right = s.length() - 1;

        //Compare characters from 1st index to last index and works toward the middle
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
