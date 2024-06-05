package codingtest.app.day;

/**
 * 정수 n이 매개변수로 주어질 때,
 * n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Day09_4 {
    public int[] solution(int n) {
        int size = n % 2 == 0 ? n / 2 : (n / 2) + 1;
        int[] answer = new int[size];
        int val = 1;
        for (int idx = 0; idx < size; idx++) {
            answer[idx] = val;
            val = val + 2;
        }
        return answer;
    }
}
