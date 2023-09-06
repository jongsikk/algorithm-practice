public class Q230906_2 {
    public static void main(String[] args) {
        String[] inputs = {
                "10.01",
                "11.001",
                "1001.001101",
                "10100.1101",
                "10111.101",
                "0.00000001",
                "0.000000001",
                "0.0000000001",
                "0.00000000001"
        };
        double[] outputs = {
                2.25,
                3.125,
                9.203125,
                20.8125,
                23.625,
                0.00390625,
                0.001953125,
                0.0009765625,
                0.00048828125
        };

        double score = test(inputs, outputs);

        System.out.printf(" %d 개의 문제 중, %1.0f 개를 맞추었습니다.", inputs.length, score);

    }

    public static double test(String[] inputs, double[] outputs) {
        double score = 0;

        for (int i = 0; i < inputs.length; i++) {

            double correctAnwser = outputs[i];
            double yourAnwser = solution(inputs[i]);
            boolean isCorrected = (correctAnwser == yourAnwser);

            int decimalLength = String.valueOf(correctAnwser).split("\\.")[1].length() + 1;

            System.out.println("**** Case " + (i + 1) + " ****");

            String inputFormat = "Input : %s \t -> Expected : %1." + decimalLength + "f %n";
            System.out.printf(inputFormat, inputs[i], correctAnwser);

            String resultFormat = "Your Answer : %1." + decimalLength + "f is ";
            System.out.printf(resultFormat, yourAnwser);

            if (isCorrected) {
                score++;
                System.out.println("Corrected Anwser");
            } else {
                System.out.println("Wrong Anwser");
            }
        }

        return score;
    }

    public static double solution(String input) {
        String[] inputs = input.split("[.]");
        double result = 0;
        String rev = "";
        for (int i = 0; i < inputs[0].length(); i++) {
            rev = inputs[0].charAt(i) + rev;
        }
        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) == '1')
                result += Math.pow(2, i);
        }
        for (int i = 0; i < inputs[1].length(); i++) {
            if (inputs[1].charAt(i) == '1')
                result += Math.pow(0.5, i + 1);
        }
        return result;
    }

}