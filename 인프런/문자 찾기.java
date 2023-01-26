import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] text = in.next().toUpperCase().toCharArray();
        char find = in.next().toUpperCase().charAt(0);

        int count = 0;
        for (char c : text) {
            if (c == find) {
                count++;
            }
        }
        System.out.println(count);
    }
}
