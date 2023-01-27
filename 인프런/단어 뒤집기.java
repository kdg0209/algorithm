// StringBuilder reverse 사용하여 풀기
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] result = new String[count];

        for (int i = 0; i < count; i++) {
            String text = in.next();
            result[i] = new StringBuilder(text).reverse().toString();
        }

        for (int i = 0; i < count; i++) {
            System.out.println(result[i]);
        }
    }
}

// for문 사용하여 뒤집어 반복하여 
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] result = new String[count];

        for (int i = 0; i < count; i++) {
            String text = in.next();
            char[] chars = text.toCharArray();

            String temp = "";
            for (int j = chars.length - 1; j >= 0; j--) {
                temp += chars[j];
            }
            result[i] = temp;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(result[i]);
        }
    }
}
