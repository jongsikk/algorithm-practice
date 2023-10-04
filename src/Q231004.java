
public class Q231004 {

    static int[] sortedArray;

    public static int add(int intValue) {
        int[] tempArray = new int[sortedArray.length + 1];

        for (int i = 0; i < sortedArray.length; i++) {
            tempArray[i] = sortedArray[i];
        }

        tempArray[tempArray.length - 1] = intValue;
        sortedArray = tempArray;

        int insertedIndex = solution(sortedArray);

        return insertedIndex;
    }

    public static int solution(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            index = i;
            for (int j = i; j >= 0; j--) {
                if (array[j] > array[index]) {
                    swap(array, index, j);
                    index = j;
                }
            }
        }
        return index;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
