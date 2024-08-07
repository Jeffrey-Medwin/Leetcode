public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if ((x < 0) || ((x != 0) && (x % 10 == 10))) {
            return false;
        }

        // traditional method - full reverse
        /*
        int rev = 0;
        int temp = x;
        while (temp != 0) {
            rev = (rev * 10) + (int) (temp % 10);
            temp /= 10;
        }

        return (rev == x);
        */

        // half reverse
        int reverse = 0;
        while (x > reverse) {
            reverse = (reverse * 10) + (int) (x % 10);
            x /= 10;
        }
        return (reverse == x) || (x == reverse / 10);
    }


    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121));
    }
}
