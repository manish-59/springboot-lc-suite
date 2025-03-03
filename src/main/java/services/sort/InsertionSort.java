package services.sort;

//Best Case: O(n) (already sorted)
//Worst Case: O(n^2)
//Space: O(1) (In-place)

public class InsertionSort {

    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
