package services.search;

public class InterpolationSearch {

//    Concept: Improves binary search by estimating position using a formula.
//    Best Case: O(1)
//    Worst Case: O(n) (For non-uniform distributions)
//    Average Case: O(loglogn)

    public int search(int[] arr, int target) {

        int low = 0, high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            if (low == high) {
                if (arr[low] == target) return low;
                return -1;
            }

            int pos = low + (((target - arr[low]) * (high - low)) /
                    (arr[high] - arr[low]));

            if (arr[pos] == target)
                return pos;
            else if (arr[pos] < target)
                low = pos + 1;
            else
                high = pos - 1;
        }

        return -1; // Element not found
    }
}
