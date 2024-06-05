package codingtest.app.day;

// 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
// queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
// my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
public class Day08_5 {
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            String prefix = my_string.substring(0, query[0]);
            String midString = "";
            String suffix = my_string.substring(query[1]);

            char[] slice = my_string.substring(query[0], query[1]).toCharArray();
            int start = 0;
            int end = slice.length - 1;

            while (start < end) {
                char temp = slice[start];
                slice[start] = slice[end];
                slice[end] = temp;

                start++;
                end--;
            }

            for (int j = 0; j < slice.length; j++) {
                midString += slice[j];
            }

            my_string = prefix + slice.toString() + suffix;
        }

        return my_string;
    }
}
