public class Solution {
    public static int solution(int n) {
        int answer = 0;
        char[] str = Integer.toString(n , 3).toCharArray();
        String reverse = "";

        for (int i = str.length - 1; i >= 0; i--) {
            reverse += str[i];
        }

        answer = Integer.parseInt(reverse, 3);
        return answer;
    }
}
