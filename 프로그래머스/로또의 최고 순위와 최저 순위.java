public class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int hit_count = 0;
        int zero_count = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) zero_count++;
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) hit_count++;
            }
        }

        answer[0] = rank(zero_count + hit_count);
        answer[1] = rank(hit_count);

        return answer;
    }

    public static int rank(int score) {
        switch (score) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
