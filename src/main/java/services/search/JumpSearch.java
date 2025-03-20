package services.search;

public class JumpSearch {

//    Concept: Jump ahead by √n steps, then do a linear search in that block.
//    Time Complexity: O(√n)
//    Best Case: O(1)
//    Worst Case: O(√n)
//    Average Case: O(√n)

    public int search(int[] arr, int target) {

        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) return -1; // Not found
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target)
                return i;
        }

        return -1; // Not found
    }
}
