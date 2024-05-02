package codingtest.app.day05;

import java.util.Arrays;

public class Day05_4 {
    public int solution(int[] num_list) {
        int sum = Arrays.stream(num_list).sum();
        int multiplication = Arrays.stream(num_list)
                .reduce(1, (a, b) -> a * b);
        return sum * sum < multiplication ? 0 : 1;
    }
}
