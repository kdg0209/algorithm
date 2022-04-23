public class Solution {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = n >= m ? n : m;
        int big = 0;
        int small = 0;

        big = n >= m ? n:m;
        small = n <= m ? n:m;

        for (int i = 1; i <= max; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }

        answer[1] = big * small / answer[0];

        return answer;
    }
}
