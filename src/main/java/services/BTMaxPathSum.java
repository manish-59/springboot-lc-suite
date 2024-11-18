package services;

public class BTMaxPathSum {

    //124

    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        getSum(root);
        return maxSum;
    }


    public int getSum(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftSum = Math.max(0,getSum(root.left));
        int rightSum = Math.max(0,getSum(root.right));
        maxSum = Math.max(maxSum , leftSum + rightSum + root.val);
        return root.val + Math.max(leftSum , rightSum);
    }
}
