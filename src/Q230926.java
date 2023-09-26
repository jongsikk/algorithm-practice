
public class Q230926 {
  public static void solution(int[] input) {
    int start = 0;
    int end = input.length - 1;
    int index;
    int min;
    for (int i = 0; i < input.length; i++) {
      if (i % 2 == 0) {
        min = input[start];
        index = start;
        for (int j = start + 1; j <= end; j++) {
          if (input[index] > input[j]) {
            index = j;
            min = input[j];
          }
        }
        int temp = input[start];
        input[start] = input[index];
        input[index] = temp;
        start++;
      } else {
        min = input[end];
        index = end;
        for (int j = end - 1; j >= start; j--) {
          if (input[index] > input[j]) {
            index = j;
            min = input[j];
          }
        }
        int temp = input[end];
        input[end] = input[index];
        input[index] = temp;
        end--;
      }
    }
  }
}
