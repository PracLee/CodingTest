package codingtest.app.day06;

public class Day06_1 {
    public int[] solution(int[] num_list) {
        int last = num_list[num_list.length - 1];
        int prev = num_list[num_list.length - 2];
        int newInt;
        if (last > prev) newInt = last - prev;
        else newInt = last * 2;

        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) answer[i] = num_list[i];
        answer[num_list.length] = newInt;

        return answer;
    }
}
