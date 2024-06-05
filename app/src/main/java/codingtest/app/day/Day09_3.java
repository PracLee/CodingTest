package codingtest.app.day;

/**
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
 * 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
 * 최빈값이 여러 개면 -1을 return 합니다.
 */
public class Day09_3 {
    public int solution(int[] array) {
        int answer = 0;
        int[] arr = new int[1000];

        for (int i = 0; i < array.length; i++) {
            arr[array[i]]++;
        }

        int index = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;

            }
        }

        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) a++;
        }

        answer = a > 1 ? -1 : index;
        return answer;
    }
}
