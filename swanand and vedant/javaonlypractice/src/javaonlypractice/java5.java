package javaonlypractice;
import java.util.Scanner;

public class java5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String original = input.toLowerCase();
        
        int start = 0;
        int end = original.length() - 1;
        boolean isPalindrome = true;
        
        while (start < end) {
            if (original.charAt(start) != original.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is NOT a palindrome.");
        }
    }
}

