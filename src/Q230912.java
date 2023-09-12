public class Q230912 {
  public static int solution(int start, int end) {
    int result = 0;
    for (int i = start; i <= end; i++) {
      int count = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          count++;
        }
      }
      if (count == 2) {
        result++;
      }
    }
    return result;
  }
}
