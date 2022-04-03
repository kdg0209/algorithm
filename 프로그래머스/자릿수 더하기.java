public class Solution {
    public static void main(String[] args) {
        int n = 123;

        solution(n);
    }

    public static int solution(int n) {
        int answer = 0;
        int temp = n;

        while (temp != 0) {
            answer += temp % 10;
            temp = temp / 10;
        }
        return answer;
    }

}
