package com.nhnacademy.aiot.advanced;

public class Q230915_2 {
    private static double correctCount = 0;
    private static final int[][] TESTCASES = {
            { 4, 5 },
            { 20, 30 },
            { 10, 15 },
            { 12, 40 },
            { 7, 11 },
            { 30, 14 },
            { 144, 60 },
            { 6, 5 },
    };
    private static final int[][] EXPECTED_VALUES = {
            { 20, 20 },
            { 60, 6 },
            { 30, 6 },
            { 120, 30 },
            { 77, 77 },
            { 210, 105 },
            { 720, 60 },
            { 30, 30 },
    };

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++) {
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i], EXPECTED_VALUES[i]));
        }
        System.out.println("정답률 = " + (int) (correctCount / TESTCASES.length) * 100 + "%");
    }

    public static boolean test(int[] inputs, int[] outputs) {
        int[] yourAnwser = solution(inputs[0], inputs[1]);

        boolean res = outputs[0] == yourAnwser[0] && outputs[1] == yourAnwser[1];
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

    private static int lcm(int first, int second) {
        int result = 0;
        result = (first * second) / gcd(first, second);
        return result;
    }

    public static int[] solution(int first, int second) {
        int result[] = new int[2];
        result[0] = lcm(first, second);
        result[1] = (result[0] / first) * (result[0] / second);
        return result;
    }
}
