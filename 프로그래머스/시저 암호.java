
public class Solution {
    public static void main(String[] args) {
        String s = "bC";
        int n = 25;
        solution(s, n);
    }

    public static String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(' ');
                continue;
            }

            int temp = s.charAt(i) + n;
            if (Character.isUpperCase(s.charAt(i))) {
                temp = temp > 90 ? temp -26 : temp;
            }

            if (Character.isLowerCase(s.charAt(i))) {
                temp = temp > 122 ? temp -26 : temp;
            }
            sb.append(Character.toChars(temp));
        }

        answer = sb.toString();
        return answer;
    }
}

// 반례 ttt 25 => sss
