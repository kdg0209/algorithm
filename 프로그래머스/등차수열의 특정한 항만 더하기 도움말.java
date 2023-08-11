public class Solution {

    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};

        System.out.println(solutionA(a, d, included));
        System.out.println(solutionB(a, d, included));
    }

    /**
     * 1. 처음 시도한 방법
     *  temp라는 임시의 배열을 만들어 누적값을 할당한 뒤 다시 반복문을 순회하여 배열의 값중 true인 값을 찾아 answer라는 변수에 누적
     *  해당 방법은 반복문을 2번사용하니 included 배열의 크기가 길어질수록 속도가 느려짐 
     */
    public static int solutionA(int a, int d, boolean[] included) {
        int answer = 0;
        int[] temp = new int[included.length];

        temp[0] = a;
        for (int i = 1; i < temp.length; i++) {
            int prev = temp[i - 1];
            temp[i] = prev + d;
        }

        for (int i = 0; i < included.length; i++) {
            boolean isTrue = included[i];
            if (isTrue) answer += temp[i];
        }
        return answer;
    }

    /**
     * 2. 두번째 시도한 방법
     *  included 배열의 길이만큼 배열을 순회하면서 특정값이 true인 값을 찾아 a + (d * i)를 사용하여 값 누적
     *  첫번째 방법은 반복문을 2번 순회하지만 두번째 방법은 반복문을 한번 순회하니 더 효율적
     */
    public static int solutionB(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            boolean isTrue = included[i];
            if (isTrue) {
                answer += a + (d * i);
            }
        }
        return answer;
    }
}
