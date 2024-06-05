package codingtest.app.day;

/**
 * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때,
 * 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
 */
public class Day10_1 {
    public int solution(int n) {
        int answer = 0;
        while (true) {
            answer++;
            if (n - (answer * 7) <= 0) break;
        }
        return answer;
    }
}
