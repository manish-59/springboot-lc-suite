package services.search;

public class LinearSearch {

//    Concept: Iterates through the list sequentially and checks each element.
//    Best Case: O(1) (Element found at the beginning)
//    Worst Case: O(n) (Element at the end or not present)
//    Average Case: O(n)

    public int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;  // Return index if found
        }
        return -1; // Element not found
    }
}
