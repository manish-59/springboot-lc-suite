package services;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamsTest {

    @Test
    public void testThis(){

        int[] arr = new int[]{5,999,1,3,88,12,324,22,781,33};
        List<Integer> arrL = Arrays.asList(5,999,1,3,88,12,324,22,781,33);

        OptionalInt max = Arrays.stream(arr).max();
        Optional<Integer> maxL = arrL.stream().max(Integer::compareTo);

        System.out.println(max.getAsInt());
        System.out.println(maxL.get());
        mergeSort(arr, 0, arr.length-1);
        System.out.println(arr[9]);
    }

    public void mergeSort(int[] arr, int l, int r){
        if(l<r){
            int mid = l+  (r-l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    public void merge(int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] L1 = new int[n1];
        int[] L2 = new int[n2];

        for(int i=0; i<n1; i++) L1[i] = arr[l+i];
        for(int j=0; j<n2; j++) L2[j] = arr[mid+1+j];

        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(L1[i] <= L2[j])
                arr[k] = L1[i++];
            else
                arr[k] = L2[j++];
            k++;
        }

        while(i<n1) arr[k++] = L1[i++];
        while(j<n2) arr[k++] = L2[j++];
    }
}
