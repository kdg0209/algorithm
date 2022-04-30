public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {1, 2, 4};
        int[] reserve = {2, 3, 4, 5};
        System.out.println(solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 도난 당한 사람체크와 그 중 자기 자신이 있으면 answer++ 시켜줌
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = -1;
                    lost[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        // 체육복을 빌려줄 수 있는 경우
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] - lost[j] == -1 || reserve[i] - lost[j] == 1) {
                    answer++;
                    lost[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
