package codingtest.app.day;

public class Day05_2 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int curInt = a;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += curInt;
            }
            curInt += d;
        }
        return answer;
    }
}
