import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        
        
        
        int num = 1111;
        
        int originalNum = num;
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        // Check if original and reversed are same
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome Number.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome Number.");
        }

      
    }
}
`
