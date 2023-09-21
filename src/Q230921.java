public class Q230921 {
    enum OrderType {
        ASC,
        DESC
    }

    public static Integer[] solution(Integer[] arr, OrderType orderType) {
        if (orderType.equals(OrderType.DESC)) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    swap(arr, j + 1, j);
                }
            }
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static void swap(Integer[] arr, int i, int j) {
        if (arr[i] > arr[j]) {
            Integer temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
