public class FirstOccuranceOfString {
    int count = -1;
    public int strStr(String haystack, String needle) {
        int length = needle.length();
        
        if ((haystack.trim().length() != 0) || needle.trim().length() != 0) {
            if (haystack.contains(needle)) {
                for (int i = 0; i <= (haystack.length() - needle.length()); i++) {
                    if (haystack.substring(i, length).equals(needle)) {
                        return i;
                    }
                    length++;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstOccuranceOfString s = new FirstOccuranceOfString();
        System.out.println(s.strStr("a", "a"));
    }
}
