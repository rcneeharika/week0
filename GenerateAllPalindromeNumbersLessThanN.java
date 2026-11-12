public class GenerateAllPalindromeNumbersLessThanN {
    public static void main(String[] args) {
        int n = 100; // Change this to your desired limit

        for (int i = 0; i < n; i++) {
            int num = i;
            int rev = 0;

            // Reverse the number
            while (num > 0) {
                rev = (rev * 10) + (num % 10);
                num = num / 10;
            }

            // Check if it's a palindrome
            if (i == rev) {
                System.out.println(i);
            }
        }
    }
}