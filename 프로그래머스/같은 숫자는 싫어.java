public class Solution {
    public static int[] solution(int []arr) {
        int[] answer = {};
        List list = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= i + 1; j++) {
               if (j < arr.length) {
                   if (arr[i] != arr[j]) list.add(arr[i]);
               }
               if ((arr.length - 1) == i) list.add(arr[i]);
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = (int)list.get(i);
        }

        return answer;
    }
}
