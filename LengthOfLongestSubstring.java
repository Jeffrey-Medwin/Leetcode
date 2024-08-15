import java.util.HashSet;

public class LengthOfLongestSubstring {
    public int findLength(String s) {
        int length = 0;
        int left = 0;
        HashSet<Character> repeatingCharacters = new HashSet<>();

        if (s.length() < 1) {
            return length;
        }
        
        for(int right = 0; right < s.length(); right++) {
            while (repeatingCharacters.contains(s.charAt(right))) {
                repeatingCharacters.remove(s.charAt(left));
                left++;
            }

            repeatingCharacters.add(s.charAt(right));
            length = Math.max(length, right - left + 1);
        }

        return length;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring length = new LengthOfLongestSubstring();
        System.out.println(length.findLength("bbbbb"));
    }
}
