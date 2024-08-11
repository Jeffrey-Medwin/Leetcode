public class PlusOne {
    public int[] plusOne(int[] digits)  {
        if (digits.length > 0) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }   
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }

    public static void main(String[] args) {
        PlusOne plus = new PlusOne();
        for (int i : plus.plusOne(new int[] {8, 9, 9, 9})) {
          System.out.println(i);  
        } 
    }
}
