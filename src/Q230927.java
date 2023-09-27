public class Q230927 {
    public static String solution(String input) {
        String result = "";
        int[] array = new int[input.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.substring(i, i + 1));
        }
        for (int i = 1; i < array.length; i++) {
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[index]) {
                    swap(array, index, j);
                    index = j;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}