package services;

class Skiplist {
    int[] arr=new int[20001];

    public Skiplist() {

    }

    public boolean search(int target) {
        return arr[target]>0;
    }

    public void add(int num) {
        arr[num]++;
    }

    public boolean erase(int num) {
        if(arr[num]==0) return false;
        arr[num]--;
        return true;
    }
}