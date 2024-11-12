package services;

public class TwoSumII {

//    Input: numbers = [2,7,11,15], target = 9
//    Output: [1,2]

    public int[] twoSum(int[] numbers, int target) {

        int[] res = new int[2];
        int strt = 0, end = numbers.length - 1;

        while(strt<end){
            int sum = numbers[strt] + numbers[end];
            if(target == sum){
                res[0] = strt+1;
                res[1] = end+1;
                break;
            }else if(sum<target){
                strt++;
            }else{
                end--;
            }
        }


        return res;
    }
}
