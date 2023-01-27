import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] text = in.next().toCharArray();
        StringBuilder sb = new StringBuilder();
      
        for (char c : text) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
      
        System.out.println(sb);
    }
}
