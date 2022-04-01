class Solution {
    public int solution(int num) {
        int answer = 0;
        long temp = num;

        while (temp != 1) {
            temp = loop(temp);
            answer++;
        }

        if (answer >= 500) answer = -1;
        return answer;
    }

    public static long loop (long num) {
        if (num % 2 == 0) {
            return num / 2;
        } else {
            return (num * 3) + 1;
        }
    }
}
