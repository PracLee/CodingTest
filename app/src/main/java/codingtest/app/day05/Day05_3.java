package codingtest.app.day05;

public class Day05_3 {
    public int solution(int a, int b, int c) {
        int sum = a + b + c;
        int squareSum = a * a + b * b + c * c;
        if (a == b && b == c) {
            return sum * squareSum * (a * a * a + b * b * b + c * c * c);
        } else if (a != b && b != c && a != c) {
            return sum;
        } else {
            return sum * squareSum;
        }
    }
}
