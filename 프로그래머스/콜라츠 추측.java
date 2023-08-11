public class Solution {

    public static void main(String[] args) {
        int num = 1;

        System.out.println(solutionA(num));
        System.out.println(solutionB(num));
    }

    /**
     * 첫번째 풀이
     * 해당 방법은 while문이 종료되고 answer 값에 대한 검증을 하므로 while문 500번 이상 순회하는 경우가 발생함
     */
    public static int solutionA(int num) {
        if (num == 0 || num == 1) return 0;
        int answer = 1;

        long result = recursive(num);
        while (result != 1) {
            result = recursive(result);
            answer++;
        }

        if (answer >= 500) return -1;
        return answer;
    }

    /**
     * 두번째 풀이
     * answer 값에 대한 검증을 while문 내부에서 함으로써 500번 이상 순회하는 경우를 방지
     */
    public static int solutionB(int num) {
        if (num == 0 || num == 1) return 0;
        int answer = 1;

        long result = recursive(num);
        while (result != 1) {
            result = recursive(result);
            answer++;

            if (answer >= 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }

    private static long recursive(long n) {
        if (n % 2 == 0) {
            return n / 2;
        }
        return (n * 3) + 1;
    }
}
