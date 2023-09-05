public class Q230904 {
    private static double correctCount = 0;
    private static final String[][] TESTCASES = new String[][] { { "MANGO", "mango" }, { "peach", "PEACH" },
            { "Apple", "aPPLE" }, { "baNANa", "BAnanA" }, { "Believe In YourSelF", "bELIEVE iN yOURsELf" },
            { "THiS is how LIFE is!!", "thIs IS HOW life IS!!" }, { "Li^^ve  p$osi&TIVE*", "lI^^VE  P$OSI&tive*" },
            { "%tiMe~~~~ iS>.< gggggolD ?:)", "%TImE~~~~ Is>.< GGGGGOLd ?:)" } };

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++)
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i][0], TESTCASES[i][1]));

        System.out.println("정답률 = " + (int) (correctCount / 8 * 100) + "%");
    }

    private static boolean test(String input, String answer) {
        boolean res = solution(input).equals(answer);
        if (res)
            correctCount++;
        return res;
    }

    // solution
    public static String solution(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                // if (c >= 97 && c <= 122) {
                result += Character.toString(c - 32);
            } else if (Character.isUpperCase(c)) {
                // } else if (c >= 65 && c <= 90) {
                result += Character.toString(c + 32);
            } else {
                result += Character.toString(c);
            }
        }
        return result;
    }
}
