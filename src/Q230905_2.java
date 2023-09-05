public class Q230905_2 {

    public static void main(String[] args) {
        double[] input = { 0.90625, 19.6875 };
        String[] output = { "0.11101", "10011.1011" };

        System.out.printf("Out of %d Cases, %1.0f were correct%n", input.length, test(input, output));
    }

    public static double test(double[] input, String[] output) {
        double score = 0;

        for (int i = 0; i < input.length; i++) {
            System.out.printf("Case %d %n", i);

            String correct = output[i];
            System.out.printf("Input : %f \t -> Expected : %s %n", input[i], output[i]);

            String str = solution(input[i]);
            System.out.printf("Your Answer : %s %n", str);

            if (str.equals(correct)) {
                score++;
            }
        }

        return score;
    }

    public static String solution(double input) {
        int input1 = (int) input;
        double input2 = input % 1;
        String result1 = "";
        String result2 = "";
        do {
            result1 = (input1 % 2) + result1;
            input1 /= 2;
        } while (input1 != 0);

        while (input2 != 0.0) {
            result2 += (int) (input2 * 2);
            input2 = (input2 * 2) % 1;
        }

        return result1 + "." + result2;
    }
}
