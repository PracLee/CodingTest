package codingtest.app.day06;

public class Day06_2 {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            char curChar = control.charAt(i);
            switch (curChar) {
                case 'w':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}
