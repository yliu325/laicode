package one;

/**
 * @author Yang on 14/01/2019.
 * @version 1.0
 */
public class InsertionSort {
    public int[] insertionSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int temp = input[i];
            int j = i - 1;
            while (j > 0 && input[j] > temp) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = temp;
        }
        return input;
    }
}
