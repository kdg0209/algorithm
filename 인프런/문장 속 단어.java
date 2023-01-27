// it is notes to study 문자열을 입력하면 notes와 study의 길이가 같지만 가장 앞에 있는 문자가 출력되어야 함

// Stream 사용하여 풀기
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] text = in.nextLine().split(" ");

        Optional<String> first = Arrays.stream(text)
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(1)
                .findFirst();

        System.out.println(first.get());
    }
}

// String split 사용하여 풀기
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] text = in.nextLine().split(" ");
        String result = "";

        for (String s : text) {
            if (text.length == 1) {
                result = s;
                break;
            }

            if (s.length() > result.length()) {
                result = s;
            }
        }

        System.out.println(result);
    }
}
