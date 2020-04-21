package seven;

/**
 * @author Yang on 2020/4/21.
 * @version 1.0
 * Remove all leading/trailing and duplicate empty spaces
 * (only leave one.one empty space if duplicated spaces happen) from the input string.
 */
public class RemoveSpace {
    public static String removeSpace(String s) {
        char[] charArr = s.toCharArray();
        int slow = 0;
        int fast = 0;
        int wordCount = 0;
        while(true) {
            while(fast < s.length() && charArr[fast] == ' ') {
                fast++;
            }

            if (fast == s.length()) {
                break;
            }

            if (wordCount > 0) {
                charArr[slow++] = ' ';
            }

            while(fast < s.length() && charArr[fast] != ' ') {
                charArr[slow++] = charArr[fast++];
                wordCount++;
            }
        }
        return String.copyValueOf(charArr).substring(0, slow);
    }

}
