package codingtest.app.day06;

public class Day06_3 {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            int prevInt = numLog[i - 1];
            int curInt = numLog[i];
            if (prevInt < curInt) {
                if (curInt - prevInt == 10) answer += "d";
                else answer += "w";
            } else {
                if (prevInt - curInt == 10) answer += "a";
                else answer += "s";
            }
        }
        return answer;
    }
}
