public class Solution {
    public static boolean solution(String s) {
        boolean answer = true;

        if(s.length() != 4 && s.length() != 6) return false;
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i);
            if (x > 58 || x < 48) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
