package com.nhnacademy.aiot.basic;

public class Q230918_1 {

    public static class Fraction {
        private int numerator; // 분자
        private int denominator; // 분모

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;

            normalize();
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void normalize() {
            // TODO
            int divisor = gcd(numerator, denominator);
            numerator /= divisor;
            denominator /= divisor;
            if (denominator < 0) {
                numerator *= -1;
                denominator *= -1;
            }
        }

        // TODO
        public static int gcd(int first, int second) {
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

        // TODO
        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
    }

    public static String solution(int numerator, int denominator) {
        // TODO
        Fraction f = new Fraction(numerator, denominator);
        return f.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < TEST_CASES.length; i++) {
            System.out.println(
                    "Test Case " + (i + 1) + " = " + test(TEST_CASES[i][0], TEST_CASES[i][1],
                            Test_CASES_RESULT[i]));
        }

        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASES.length * 100));
    }

    private static double correct = 0;

    private static boolean test(int numerator, int denominator, String result) {
        if (solution(numerator, denominator).equals(result)) {
            correct++;
            return true;
        }

        return false;
    }

    private static final int[][] TEST_CASES = {
            { 1, 4 },
            { -10, 20 },
            { 10, -20 },
            { -5, -10 },
            { 7, 39 },
            { 100, 100 },
            { 369, 444 },
            { 1_000_000, 1_998_244_353 },
            { 1_234_567, 999_999_937 }
    };

    private static String[] Test_CASES_RESULT = {
            "1/4",
            "-1/2",
            "-1/2",
            "1/2",
            "7/39",
            "1/1",
            "123/148",
            "1000000/1998244353",
            "1234567/999999937"
    };

}
