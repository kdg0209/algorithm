public class Solution {
    public static long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }

        if (money == 0) {
            answer = 0;
        } else if(money > sum) {
            answer = 0;
        } else {
            answer = sum - money;
        }
        return answer;
    }
}
