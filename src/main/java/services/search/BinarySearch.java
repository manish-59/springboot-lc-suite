package services.search;

public class BinarySearch {

//    Concept: Repeatedly divides the search range in half.
//    Best Case: O(1) (Middle element is the target)
//    Worst Case: O(logn) (Dividing the range in half)
//    Average Case: O(logn)

    public int search(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1; // Element not found
    }
}
