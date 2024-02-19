package org.example.reverseInteger;

public class Main {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }

    private static int reverse(int x) {
        int answer = 0;
        while (x != 0) {
            int digest = x % 10;
            if (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && digest > 7)) {
                return 0;
            }
            if (answer < Integer.MIN_VALUE / 10 || (answer == Integer.MIN_VALUE / 10 && digest < -8)) {
                return 0;
            }
            answer = answer * 10 + digest;
            x = x / 10;
        }
        return answer;
    }
}
