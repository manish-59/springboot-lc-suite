package services;

class KthLargest {

    //703

    private int[] heap;  // Array-based min-heap
    private int k;
    private int size;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.heap = new int[k];
        this.size = 0;

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (size < k) {
            heap[size] = val;
            size++;
            heapifyUp(size - 1);
        } else if (val > heap[0]) {
            heap[0] = val;
            heapifyDown(0);
        }

        return heap[0];
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap[parentIndex] > heap[index]) {
                swap(parentIndex, index);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }
            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
