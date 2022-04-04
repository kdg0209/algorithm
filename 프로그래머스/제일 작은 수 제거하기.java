
import java.util.*;

public class Solution {
    public static int[] solution(int[] arr) {
        int[] answer = new int[1];
        List<Integer> list = new ArrayList();

        if (arr.length == 1) {
            answer[0] = -1;
            return answer;
        } else {
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }

            int min = Collections.min(list);

            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() == min) {
                    iterator.remove();
                }
            }

            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}
