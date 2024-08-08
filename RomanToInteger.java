import java.util.HashMap;

public class RomanToInteger {
    public int romanToInteger(String s) {
        int length = s.length();
        int number = 0;
        if (length > 0) {

            HashMap<Character, Integer> romanMap = new HashMap<>();
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);

            for (int i = 0; i < length; i++) {
                if ((i < length - 1) && (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1)))) {
                    number -= romanMap.get(s.charAt(i));
                } else {
                    number += romanMap.get(s.charAt(i));
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        RomanToInteger romanTnteger = new RomanToInteger();
        System.out.println(romanTnteger.romanToInteger("IV"));
    }
}