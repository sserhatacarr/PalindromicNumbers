public class Main {
    // Method to check if a given number is a palindrome
    static boolean isPalindrome(int number) {
        int temp = number;  // Store the original number
        int reverseNumber = 0;  // Initialize a variable to store the reverse of the number
        int lastNumber;  // Variable to store the last digit of the number

        // Reverse the digits of the number
        while (temp != 0) {
            lastNumber = temp % 10;  // Get the last digit of the number
            reverseNumber = (reverseNumber * 10) + lastNumber;  // Append the last digit to the reversed number
            temp /= 10;  // Remove the last digit from the temporary variable
        }

        // Check if the reversed number is equal to the original number, indicating a palindrome
        return reverseNumber == number;
    }

    public static void main(String[] args) {
        // Test the isPalindrome method with a number (6556) and print the result
        System.out.println(isPalindrome(6556));
    }
}

