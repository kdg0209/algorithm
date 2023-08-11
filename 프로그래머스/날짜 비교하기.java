import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) {
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 28};

        System.out.println(solution(date1, date2));
    }

    /**
     * LocalDate로 변환하여 날짜를 비교하여 품
     */
    public static int solution(int[] date1, int[] date2) {
        LocalDate localDateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate localDateB = LocalDate.of(date2[0], date2[1], date2[2]);

        if (localDateB.isAfter(localDateA)) return 1;
        return 0;
    }
}
