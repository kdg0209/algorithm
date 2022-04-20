import java.util.Arrays;

public class Solution {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);

        if (Arrays.stream(d).sum() <= budget) {
            answer = d.length;
        } else {
            for (int i = 0; i < d.length; i++) {
                sum += d[i];

                if (sum <= budget) {
                    answer = i + 1;
                }
            }
        }
        return answer;
    }
}
