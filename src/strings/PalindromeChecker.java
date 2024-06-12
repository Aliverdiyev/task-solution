package strings;

import java.util.Scanner;

/*
write a Java program check if word is Palindrome
*/
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    // method-1
    public static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // for lowercase method
    public static boolean isPalindrome2(String word) {
        int left = 0;
        int right = word.length() - 1;
        // Iterate until left pointer crosses right pointer
        while (left < right) {
            // Compare characters at left and right pointers (case-insensitive)
            if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) {
                return false;
            }
            // Move pointers towards the middle
            left++;
            right--;
        }
        // If loop completes, all characters match and it's a palindrome
        return true;
    }
}