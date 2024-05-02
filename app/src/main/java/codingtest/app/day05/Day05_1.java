package codingtest.app.day05;

public class Day05_1 {
    public String solution(String code) {
        boolean mode = true;
        String ret = "";
        for (int i = 0; i < code.length(); i++) {
            char curChar = code.charAt(i);
            mode = curChar == '1' ? !mode : mode;
            if (mode) {
                if (curChar != '1' && i % 2 == 0) {
                    ret = ret + curChar;
                }
            } else {
                if (curChar != '1' && i % 2 == 1) {
                    ret = ret + curChar;
                }
            }
        }
        String answer = ret.equals("") ? "EMPTY" : ret;
        return answer;
    }

}
