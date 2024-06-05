package codingtest.app.day;

public class Day06_5 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int answerIdx = -1;
        for (int[] query : queries) {
            answerIdx++;
            int startIdx = query[0];
            int endIdx = query[1];
            int findVal = query[2];
            int minVal = -1;
            for (int i = startIdx; i <= endIdx; i++) {
                if (arr[i] > findVal) {
                    if (minVal == -1 || arr[i] < arr[minVal]) {
                        minVal = i;
                    }
                }
            }
            answer[answerIdx] = minVal != -1 ? arr[minVal] : -1;
        }
        return answer;
    }
}
