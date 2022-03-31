import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        List sumList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    sumList.add(sum);
                }
            }
        }

        Iterator iterator = sumList.iterator();
        while (iterator.hasNext()) {
            boolean isPrime = true;
            int number = (int) iterator.next();
            for (int i = 2 ; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                answer++;
            }
        }

        return answer;
    }
}
