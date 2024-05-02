package codingtest.app.day05;

public class Day06_5 {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        for (int curNum : num_list) {
            if (curNum % 2 == 1) even += curNum;
            else odd += curNum;
        }
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
