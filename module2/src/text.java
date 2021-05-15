import java.util.*;

public class text {
    public static void main(String[] args) {


        int arr[] = {9, 14, 3, 2, 43, 11, 58, 22};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int current = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > current)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = current;
        }
    }

}
