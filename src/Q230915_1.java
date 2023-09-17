package com.nhnacademy.aiot.basic;

public class Q230915_1 {
    private static double correctCount = 0;
    private static final int[][] TESTCASES = new int[][] {
            { 1, 1, 1 },
            { 123, 345, 14145 },
            { 2, 81, 162 },
            { 3, 7, 21 },
            { 19, 87, 1653 },
            { 1, 40, 40 }
    };

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++) {
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i][0], TESTCASES[i][1], TESTCASES[i][2]));
        }
        System.out.println("정답률 = " + (int) (correctCount / TESTCASES.length * 100) + "%");
    }

    private static boolean test(int first, int second, int answer) {
        boolean res = solution(first, second) == answer;
        if (res)
            correctCount++;
        return res;
    }

    private static int gcd(int first, int second) {
        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }
        while (second != 0) {
            int temp = first % second;
            first = second;
            second = temp;
        }
        return first;
    }

    public static int solution(int first, int second) {
        int result = 0;
        result = (first * second) / gcd(first, second);
        return result;
    }
}
