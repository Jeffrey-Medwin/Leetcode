import java.util.Arrays;

public class CommonPrefix {
    public String findLongestCommonPrefix(String[] strs) {
        StringBuilder commonLetter = new StringBuilder();
        int arrayLength = strs.length;
        
        if (arrayLength > 0) {
            Arrays.sort(strs);    

            String firstIndex = strs[0];
            String lastIndex = strs[arrayLength - 1];

            for (int i = 0; i < Math.min(firstIndex.length(), lastIndex.length()); i++) {
                if (firstIndex.charAt(i) != lastIndex.charAt(i)) {
                    return commonLetter.toString();
                }
                commonLetter.append(firstIndex.charAt(i));
            }
        }

        return commonLetter.toString();
    }
    public static void main(String[] args) {
        CommonPrefix commonPrefix = new CommonPrefix();
        System.out.println(commonPrefix.findLongestCommonPrefix(new String[] {"flower", "glow", "floght"}));
    }
}
