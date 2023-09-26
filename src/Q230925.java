public class Q230925 {
    public static String solution(String input) {
        String result = "";
        int[] arr = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = Integer.parseInt(input.substring(i, i + 1));
        }
        int min = arr[0];
        for (int i = 0; i < input.length(); i++) {
            int index = i;
            for (int j = i + 1; j < input.length(); j++) {
                if (arr[j] < arr[index]) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < input.length(); i++) {
            result += arr[i] + "";
        }
        return result;
    }

    public static void main(String[] args) {
        solution("572961348");
    }
}