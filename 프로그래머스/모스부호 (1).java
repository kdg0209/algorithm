import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<String, String> MAP = new HashMap<>();

    static {
        MAP.put(".-", "a");
        MAP.put("-...", "b");
        MAP.put("-.-.", "c");
        MAP.put("-..", "d");
        MAP.put(".", "e");
        MAP.put("..-.", "f");
        MAP.put("--.", "g");
        MAP.put("....", "h");
        MAP.put("..", "i");
        MAP.put(".---", "j");
        MAP.put("-.-", "k");
        MAP.put(".-..", "l");
        MAP.put("--", "m");
        MAP.put("-.", "n");
        MAP.put("---", "o");
        MAP.put(".--.", "p");
        MAP.put("--.-", "q");
        MAP.put(".-.", "r");
        MAP.put("...", "s");
        MAP.put("-", "t");
        MAP.put("..-", "u");
        MAP.put("...-", "v");
        MAP.put(".--", "w");
        MAP.put("-..-", "x");
        MAP.put("-.--", "y");
        MAP.put("--..", "z");
    }

    public static void main(String[] args) {
        String letter = ".--. -.-- - .... --- -.";

        System.out.println(solution(letter));
    }

    /**
     * Map을 사용하여 모스부호를 저장한 뒤 put하여 문자열 연결
     */
    public static String solution(String letter) {
        String answer = "";
        String[] split = letter.split(" ");

        for (String s : split) {
            answer += MAP.get(s);
        }

        return answer;
    }
}
