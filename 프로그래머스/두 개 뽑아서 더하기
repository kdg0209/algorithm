public class Solution {
    public static void main(String[] args) {
        int [] array = {2,1,3,4,1};
    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                treeSet.add(sum);
            }
        }

        answer = new int[treeSet.size()];
        Iterator iter = treeSet.iterator();
        for (int i = 0; i < treeSet.size(); i++) {
            answer[i] = (int)iter.next();
        }

        return answer;
    }
}
