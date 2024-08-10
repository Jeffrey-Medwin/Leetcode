public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // by arrays
        // runtime takes 2ms
        /*
        String trimString = s.trim();
        if (trimString.length() > 0) {
            String[] sArray = trimString.split("\\s+");
            return sArray[sArray.length - 1].length();
        }
        return 0;
        */

        // by backward loop
        String trimString = s.trim();
        int wordSize = 0;
        if (trimString.length() > 0) {
            for (int i = trimString.length() - 1; i > -1; i--) {
                if (trimString.charAt(i) != ' ') {
                    // System.out.println(wordSize);
                    wordSize++;
                } else {  
                    break;
                }
            }
        }
        return wordSize;
    }
    public static void main(String[] args) {
        LengthOfLastWord lastWord = new LengthOfLastWord();
        System.out.println(lastWord.lengthOfLastWord("luffy is still joyboy"));
    }
}
