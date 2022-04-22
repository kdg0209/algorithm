public class Solution {
    public static void main(String[] args) {
        String s = "aa aa "; // 반례
//        String s = "try hello world";
        solution(s);
    }

    public static String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index = 0;
                sb.append(' ');
                continue;
            }

            if (index % 2 == 0) {
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            index++;
        }

        answer = sb.toString();
        return answer;
    }
}
