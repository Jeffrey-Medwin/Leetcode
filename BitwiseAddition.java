class BitwiseAddition {

    public String addition(String bit1, String bit2) {
        StringBuilder result = new StringBuilder();
        int bit1Length = bit1.length() - 1;
        int bit2Length = bit2.length() - 1;
        int carry = 0;

        while ((bit1Length >= 0) || (bit2Length >= 0) || (carry == 1)) {
            if (bit1Length >= 0) {
                carry += bit1.charAt(bit1Length--) - '0';
            }

            if (bit2Length >= 0) {
                carry += bit2.charAt(bit2Length--) - '0';
            }

            // carry % 2 because if carry == 2...... 
            //then bit1 == 1 && bit2 == 1.., Hence sum == 0 (line 20); carry == 1 (line 21)
            result.append(carry % 2);
            carry /= 2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
    BitwiseAddition bitAddition = new BitwiseAddition();
    System.out.println(bitAddition.addition("11", "1"));
    }
}