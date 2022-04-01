class Solution {
    public int solution(int n) {
        int answer = 0;

        // 2부터 n까지
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
          
            // 2부터 배수로 찾기
            // 4, 5, 6, 7, 8, 9, 10, 11, 12, ...
            // 4, 9, 16, 25, 36, 49, 64, 81, ...
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) answer++;
        }

        return answer;
    }
}
