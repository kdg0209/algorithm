import java.util.*;

public class Solution {
    public static int solution(int[] nums) {
        int answer = 0;
        int cat = nums.length / 2; // 잡을 수 있는 수
        Set set = new HashSet();

        // 중복 제거
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if (cat < set.size()) answer = cat;
        if (cat == set.size()) answer = cat;
        if (cat > set.size()) answer = set.size();

        return answer;
    }

}
