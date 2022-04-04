
public class Solution {
    public static String solution(String s) {
        String answer = "";
        int len = s.length() % 2 == 0 ? s.length() / 2 : s.length();

        if (s.length() % 2 != 0) {
            for (int i = 0; i < s.length(); i++) {
                if (i == s.length() - i - 1) {
                    answer = "" + s.charAt(i);
                    break;
                }
            }
        } else {
            answer = s.substring(len -1, len +1);
        }

        return answer;
    }
}
