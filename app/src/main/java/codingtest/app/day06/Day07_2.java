package codingtest.app.day06;


import java.util.ArrayList;

// 정수 l과 r이 주어졌을 때, l 이상 r 이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를
// 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
// 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
public class Day07_2 {
    public int[] solution(int l, int r) {
        int[] wrongAnswer = {-1};
        ArrayList<Integer> answerArray = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String curIntToString = String.valueOf(i);
            curIntToString = curIntToString.replace("0", "");
            curIntToString = curIntToString.replace("5", "");
            if (curIntToString.equals("")) {
                answerArray.add(i);
            }
        }
        if (answerArray.size() == 0) return wrongAnswer;

        int[] answer = answerArray.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
