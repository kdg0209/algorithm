class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr2.length; i++) {
            String key = "";
            String first = Integer.toBinaryString(arr1[i]);
            String second = Integer.toBinaryString(arr2[i]);

            while (first.length() < n) first = "0" + first;
            while (second.length() < n) second = "0" + second;

            for (int j = 0; j < first.length(); j++) {
                if (first.charAt(j) == '1' || second.charAt(j) == '1'){
                    key += "#";
                } else {
                    key += " ";
                }

            }
            answer[i] = key;
        }
        return answer;
    }
}
